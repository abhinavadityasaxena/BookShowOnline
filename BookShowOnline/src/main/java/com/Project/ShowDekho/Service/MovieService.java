package com.Project.ShowDekho.Service;

import com.Project.ShowDekho.Model.Movie;
import com.Project.ShowDekho.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) { this.movieRepository = movieRepository; }

    public Movie addNewMovies(Movie movie){
        movie.setCreatedAt(LocalDateTime.now());
        movie.setUpdatedAt(LocalDateTime.now());
        return movieRepository.save(movie);
    }

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Movie getMovieById(Integer movie_id){
        return movieRepository.findMovieByMovieId(movie_id);
    }
}
