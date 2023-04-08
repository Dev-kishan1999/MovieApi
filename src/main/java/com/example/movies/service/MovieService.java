package com.example.movies.service;

import com.example.movies.model.Movies;
import com.example.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movies> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movies> singleMovie(String imdbId) {
        return movieRepository.findMoviesByImdbId(imdbId);
    }
}
