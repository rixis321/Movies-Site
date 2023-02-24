package dev.rixis.movies.movies.service;

import dev.rixis.movies.movies.repository.MovieRepository;
import dev.rixis.movies.movies.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> allMovies(){
        return movieRepository.findAll();

    }

    public Optional<Movie> singleMovie(String imbId){
        return movieRepository.findMovieByImdbId(imbId);
    }
}
