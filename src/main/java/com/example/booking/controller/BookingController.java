package com.example.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.booking.model.Booking;
import com.example.booking.service.BookingService;


@RestController
@RequestMapping("/rest/v1/booking")
public class BookingController {

	BookingService bookingService;

	@GetMapping("/viewBooking")
	public ResponseEntity<Booking> viewBooking(@RequestBody Booking booking) {
		Booking bookingDetails = bookingService.viewBooking(booking);
		return new ResponseEntity<>(bookingDetails, HttpStatus.OK);
	}

	@PostMapping("/saveBooking")
	public ResponseEntity<String> createBooking(@RequestBody Booking booking) {
		bookingService.saveBooking(booking);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PostMapping("/updateBooking")
	public ResponseEntity<String> updateBooking(@RequestBody Booking booking) {
		bookingService.updateBooking(booking);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PostMapping("/cancelBooking")
	public ResponseEntity<String> cancelBooking(@RequestBody Booking booking) {
		bookingService.cancelBooking(booking);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
