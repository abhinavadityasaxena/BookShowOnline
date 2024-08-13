package com.Project.ShowDekho.Controllers;

import com.Project.ShowDekho.Model.Booking;
import com.Project.ShowDekho.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {
    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) { this.bookingService = bookingService; }

    @PostMapping(value = "showdekho.com/booking/insert")
    public ResponseEntity<Booking> registerNewBooking(@RequestBody Booking booking){
        Booking currBooking = bookingService.addNewBooking(booking);
        return ResponseEntity.ok(currBooking);
    }

    @GetMapping(value = "showdekho.com/booking/get")
    public List<Booking> getBookings(){
        return bookingService.getAllBooking();
    }

    @GetMapping(value = "showdekho.com/booking/{movieSn}")
    public List<Booking> getAllBookedSeat(@PathVariable("movieSn") Integer movieSn){
        return bookingService.getBookedSeat(movieSn);
    }
}
