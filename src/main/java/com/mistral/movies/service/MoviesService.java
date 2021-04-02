package com.mistral.movies.service;

import com.mistral.movies.domain.Movie;
import com.mistral.movies.repository.MoviesRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.logging.Logger;

@Service
@Transactional
public class MoviesService {

    private static final Logger LOGGER = Logger.getLogger(MoviesService.class.getName());

    private final MoviesRepository moviesRepository;

    public MoviesService(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    public List<Movie> findAll()
    {
        return moviesRepository.findAll();
    };

    public List<Movie> findbyTextAtributeOrderbyRate(String text)
    {
        return moviesRepository.findbyTextAtributeOrderbyRate(text);
    };
}
