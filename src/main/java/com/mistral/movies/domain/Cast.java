package com.mistral.movies.domain;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Entity
public class Cast {

    @Id
    private Integer id;

    @Column(name = "movie_id")
    private Integer movieId;

    @ManyToOne
    @JoinColumn(name = "cast_member_id", referencedColumnName = "id")
    @Fetch(FetchMode.JOIN)
    private CastMember castMember;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CastMember getCastMember() {
        return castMember;
    }

    public void setCastMember(CastMember castMember) {
        this.castMember = castMember;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }
}
