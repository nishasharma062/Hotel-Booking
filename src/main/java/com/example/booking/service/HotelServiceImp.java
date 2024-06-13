package com.example.booking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.booking.exceptions.HotelExceptions;
import com.example.booking.model.Hotel;
import com.example.booking.repository.HotelRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class HotelServiceImp implements HotelService{


	@Autowired
	HotelRepository hotelRepo;
	
	@Override
	public Hotel viewHotel(Hotel hotel) {
		Optional<Hotel> hotelDetails = hotelRepo.findById(hotel.getHotelId());

		return hotelDetails.get();
	}

	@Override
	public void saveHotel(Hotel hotel) {
		hotelRepo.save(hotel);	
		log.info("Hotel Saved Successfully ");

	}

	@Override
	public void updateHotel(Hotel hotel) {
		Optional<Hotel> hotelDetails = hotelRepo.findById(hotel.getHotelId());
		if(hotelDetails.isEmpty())
		{
			throw new HotelExceptions("Hotel Not Found");

		}
		if(hotelDetails.isPresent())
		{
			hotelDetails.get().setHotelName(hotel.getHotelName());
		}
		hotelRepo.save(hotelDetails.get());
		log.info("Hotel Updated Successfully ");

	}

	@Override
	public void deleteHotel(Hotel hotel) {
	Optional<Hotel> hotelDetails = hotelRepo.findById(hotel.getHotelId());
		
		hotelRepo.delete(hotelDetails.get());
		log.info("Hotel deleted Successfully ");

	}

}
