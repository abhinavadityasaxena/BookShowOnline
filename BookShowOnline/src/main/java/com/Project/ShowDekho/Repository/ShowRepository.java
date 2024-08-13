package com.Project.ShowDekho.Repository;

import com.Project.ShowDekho.Model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ShowRepository extends JpaRepository<Show, Integer> {
    @Query(value = "SELECT * FROM play WHERE movie_id = :movieId AND date >= :date", nativeQuery = true)
    List<Show> getShowByMovieId(Integer movieId, LocalDate date);
}
