package com.example.booking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.booking.exceptions.BookingExceptions;
import com.example.booking.model.Booking;
import com.example.booking.repository.BookingRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BookingServiceImp implements BookingService{
	
	@Autowired
	BookingRepository bookingRepo;

	@Override
	public void saveBooking(Booking booking) {
		bookingRepo.save(booking);
		log.info("Booking Saved Successfully ");

	}

	@Override
	public void updateBooking(Booking booking) {
		Optional<Booking> bookingDetails = bookingRepo.findById(booking.getBookingId());
		
		if(bookingDetails.isEmpty())
		{
			throw new BookingExceptions("Booking Not Found");

		}
		
		if(bookingDetails.isPresent())
		{
			bookingDetails.get().setHotel(booking.getHotel());
			bookingDetails.get().setUser(booking.getUser());
		}
		bookingRepo.save(bookingDetails.get());
		log.info("Booking Updated Successfully ");

	}

	@Override
	public void cancelBooking(Booking booking) {
		bookingRepo.delete(booking);
		log.info("Booking Deleted Successfully ");

	}

	@Override
	public Booking viewBooking(Booking booking) {
		Optional<Booking> bookingDetails = bookingRepo.findById(booking.getBookingId());

		return bookingDetails.get();
	}
	
	

}
