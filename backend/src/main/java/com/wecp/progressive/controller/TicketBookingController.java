package com.wecp.progressive.controller;

import com.wecp.progressive.entity.TicketBooking;
import com.wecp.progressive.service.impl.TicketBookingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketBookingController {

    @Autowired
    TicketBookingServiceImpl ticketBookingService;

    @GetMapping
    public ResponseEntity<List<TicketBooking>> getAllBookings() {
        List<TicketBooking> ticketBookings = ticketBookingService.getAllTicketBookings();
        return new ResponseEntity<>(ticketBookings, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Integer> createBooking(@RequestBody TicketBooking ticketBooking) {
        int id = ticketBookingService.createBooking(ticketBooking);
        return new ResponseEntity<>(id, HttpStatus.CREATED);
    }

    @DeleteMapping("/{bookingId}")
    public ResponseEntity<Void> cancelBooking(@PathVariable int bookingId) {
        ticketBookingService.cancelBooking(bookingId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/user/{email}")
    public ResponseEntity<List<TicketBooking>> getBookingsByUserEmail(@PathVariable String email) {
        List<TicketBooking> ticketBookings = ticketBookingService.getBookingsByUserEmail(email);
        return new ResponseEntity<>(ticketBookings, HttpStatus.OK);
    }
}
