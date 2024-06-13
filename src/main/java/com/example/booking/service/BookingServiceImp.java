package com.example.booking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.booking.exceptions.BookingExceptions;
import com.example.booking.model.Booking;
import com.example.booking.repository.BookingRepository;

@Service
public class BookingServiceImp implements BookingService{
	
	@Autowired
	BookingRepository bookingRepo;

	@Override
	public void saveBooking(Booking booking) {
		bookingRepo.save(booking);
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
	}

	@Override
	public void cancelBooking(Booking booking) {
		bookingRepo.delete(booking);
	}

	@Override
	public Booking viewBooking(Booking booking) {
		Optional<Booking> bookingDetails = bookingRepo.findById(booking.getBookingId());

		return bookingDetails.get();
	}
	
	

}
