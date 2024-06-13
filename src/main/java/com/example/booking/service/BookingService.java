package com.example.booking.service;

import org.springframework.stereotype.Service;

import com.example.booking.model.Booking;
import com.example.booking.model.Hotel;

public interface BookingService {

	void saveBooking(Booking booking);

	void updateBooking(Booking booking);

	void cancelBooking(Booking booking);

	Booking viewBooking(Booking booking);

}
