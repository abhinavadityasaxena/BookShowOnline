package com.Project.ShowDekho.Repository;

import com.Project.ShowDekho.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
    @Query(value = "SELECT * FROM movie WHERE movie_id = :movie_id", nativeQuery = true)
    Movie findMovieByMovieId(Integer movie_id);
}
