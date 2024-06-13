package com.example.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.booking.model.Booking;
import com.example.booking.model.Hotel;
import com.example.booking.service.HotelService;

@RestController
public class HotelController {
	
	HotelService hotelService;

	@GetMapping("/viewHotel")
	public ResponseEntity<Hotel> viewHotel(@RequestBody Hotel hotel) {
		Hotel hotelDetails = hotelService.viewHotel(hotel);
		return new ResponseEntity<>(hotelDetails, HttpStatus.OK);
	}

	@PostMapping("/saveHotel")
	public ResponseEntity<String> createHotel(@RequestBody Hotel Hotel) {
		hotelService.saveHotel(Hotel);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PostMapping("/updateHotel")
	public ResponseEntity<String> updateHotel(@RequestBody Hotel hotel) {
		hotelService.updateHotel(hotel);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PostMapping("/cancelHotel")
	public ResponseEntity<String> deleteHotel(@RequestBody Hotel hotel) {
		hotelService.deleteHotel(hotel);
		return new ResponseEntity<>(HttpStatus.OK);
	}


}
