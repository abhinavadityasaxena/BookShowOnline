package com.Project.ShowDekho.Controllers;

import com.Project.ShowDekho.Model.Movie;
import com.Project.ShowDekho.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) { this.movieService = movieService; }

    @PostMapping(value = "showdekho.com/movies/insert")
    public ResponseEntity<Movie> registerNewMovie(@RequestBody Movie movie) {
        Movie currMovie = movieService.addNewMovies(movie);
        return ResponseEntity.ok(currMovie);
    }

    @GetMapping(value = "showdekho.com/movies/get")
    public List<Movie> getMovies(){
        return movieService.getAllMovies();
    }

    @GetMapping(value = "showdekho.com/movies/{movieId}")
    public Movie getMovieByMovieId(@PathVariable("movieId") Integer movie_id){
        return movieService.getMovieById(movie_id);
    }
}
