package com.Project.ShowDekho.Repository;

import com.Project.ShowDekho.Model.Cast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CastRepository extends JpaRepository<Cast, Integer> {
    @Query(value = "SELECT * FROM cast WHERE cast_id = :cast_id", nativeQuery = true)
    List<Cast> findCastByCastId(Integer cast_id);
}
