package com.example.booking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.booking.exceptions.HotelExceptions;
import com.example.booking.exceptions.UserExceptions;
import com.example.booking.model.User;
import com.example.booking.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserServiceImp implements UserService {
	
	@Autowired
	UserRepository userRepo;

	@Override
	public User viewUser(User user) {
		Optional<User> userDetails = userRepo.findById(user.getUserId());
		if(userDetails.isEmpty())
		{
			throw new UserExceptions("User Not Found");

		}
		return userDetails.get();
	}

	@Override
	public void saveUser(User user) {
		userRepo.save(user);		
		log.info("User Saved Successfully ");

	}

	@Override
	public void updateUser(User user) {
	Optional<User> userDetails = userRepo.findById(user.getUserId());
		
		if(userDetails.isPresent())
		{
			userDetails.get().setUserName(user.getUserName());
		}
		userRepo.save(userDetails.get());
		log.info("User Updated Successfully ");

	}

	@Override
	public void deleteUser(User user) {
		Optional<User> hotelDetails = userRepo.findById(user.getUserId());
		
		userRepo.delete(hotelDetails.get());
		
		log.info("User Deleted Successfully ");

	}

}
