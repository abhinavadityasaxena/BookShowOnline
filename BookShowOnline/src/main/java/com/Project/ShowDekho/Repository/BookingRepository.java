package com.Project.ShowDekho.Repository;

import com.Project.ShowDekho.Model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
    @Query(value = "SELECT * FROM booking Where movie_sn = :movieSn", nativeQuery = true)
    List<Booking> findBookedSeat(Integer movieSn);
}
