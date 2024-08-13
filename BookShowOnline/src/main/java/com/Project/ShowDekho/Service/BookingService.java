package com.Project.ShowDekho.Service;

import com.Project.ShowDekho.Model.Booking;
import com.Project.ShowDekho.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) { this.bookingRepository = bookingRepository; }

    public Booking addNewBooking(Booking booking) {
        booking.setCreatedAt(LocalDateTime.now());
        booking.setUpdatedAt(LocalDateTime.now());
        return bookingRepository.save(booking);
    }

    public List<Booking> getAllBooking(){
        return bookingRepository.findAll();
    }

    public List<Booking> getBookedSeat(Integer movieSn){
        return bookingRepository.findBookedSeat(movieSn);
    }
}
