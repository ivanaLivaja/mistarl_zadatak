package com.mistral.movies.util;

import com.mistral.movies.domain.Movie;
import com.mistral.movies.dto.MovieDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;

@Component
public class Helpper {

    private ModelMapper modelMapper = new ModelMapper();;

    public MovieDto convertToDto(Movie movie) {
        MovieDto movieDto = modelMapper.map(movie, MovieDto.class);
        if (movie != null
                && movie.getMovieRate() != null
                && movie.getMovieRate().getGrade() != null
                && movie.getMovieRate().getUserCount() != null)
        {
            BigDecimal bg1, bg2, bg3, bg4;

            bg1 = new BigDecimal(movie.getMovieRate().getGrade());
            bg2 = new BigDecimal(movie.getMovieRate().getUserCount());

            bg3 = bg1.divide(bg2, 1);
            bg4 = bg1.divide(bg2, 0);

            movieDto.getMovieRate().setAvrgRate(bg3);
            movieDto.setSortByValue(bg3);

            ArrayList<Integer> stars = new ArrayList<>();

            for (int i=0; i< bg4.intValue(); i++) {
                stars.add(new Integer(1));
            }

            movieDto.getMovieRate().setStars(stars);
        }
        return movieDto;
    }
}
