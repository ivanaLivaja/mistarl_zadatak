package com.mistral.movies.rest;

import com.mistral.movies.domain.Movie;
import com.mistral.movies.dto.MovieDto;
import com.mistral.movies.errors.CustomException;
import com.mistral.movies.errors.CustomRestExceptionHandler;
import com.mistral.movies.service.MoviesService;
import com.mistral.movies.util.Helpper;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class MoviesRestController {

    @Autowired
    MoviesService moviesService;

    @Autowired
    Helpper helpper;

    @Autowired
    CustomRestExceptionHandler customRestExceptionHandler;


    @GetMapping(value = "/movies")
    public List<MovieDto> getAllMovies() {

            List<Movie> movies = moviesService.findAll();
            List<MovieDto> moviesDtoList = new ArrayList<>();

            Map<Integer, BigDecimal> map = new LinkedHashMap<>();

            if (movies != null){

                for (Movie m: movies) {
                    moviesDtoList.add(helpper.convertToDto(m));
                }
            }
            else {

                throw new CustomException("No data found!!");
            }

            return moviesDtoList;
    }

    @GetMapping(value = "/movies/{text}")
    public List<MovieDto> getMoviesByTextAtribute(@PathVariable String text) {

        if (text != null && !text.isEmpty() && text.length() >= 2)
        {
            List<Movie> movies = moviesService.findbyTextAtributeOrderbyRate('%' + text.toUpperCase() + '%');
            List<MovieDto> moviesDtoList = new ArrayList<>();

            if (movies != null){

                for (Movie m: movies) {
                    moviesDtoList.add(helpper.convertToDto(m));
                }
            }
            else {
                throw new CustomException("Unpredicted error!");
            }
            return moviesDtoList;
        }
        else
        {
             return new ArrayList<MovieDto>();
        }

    }

}
