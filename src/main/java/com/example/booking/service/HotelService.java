package com.example.booking.service;

import org.springframework.stereotype.Service;

import com.example.booking.model.Booking;
import com.example.booking.model.Hotel;

public interface HotelService {

	Hotel viewHotel(Hotel hotel);

	void saveHotel(Hotel hotel);

	void updateHotel(Hotel hotel);

	void deleteHotel(Hotel hotel);

}
