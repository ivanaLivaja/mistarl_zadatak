package com.mistral.movies.repository;

import com.mistral.movies.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MoviesRepository extends JpaRepository<Movie, Integer> {

    @Query(value = "select * from MOVIE a, MOVIE_RATE b, CAST c, CAST_MEMBER d where a.MOVIE_RATE_ID = b.ID and d.ID = c.CAST_MEMBER_ID and c.MOVIE_ID = a.ID \n" +
            " and (upper(a.TITLE ) like :text or upper(a.DESCRIPTION ) like :text or upper(d.NAME)  like :text) order by (GRADE /USER_COUNT ) desc ", nativeQuery = true)
    public List<Movie> findbyTextAtributeOrderbyRate(@Param("text") String text);

}
