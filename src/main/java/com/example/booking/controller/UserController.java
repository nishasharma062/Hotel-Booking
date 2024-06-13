package com.example.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.booking.model.User;
import com.example.booking.service.UserService;

public class UserController {
	
	@Autowired
	UserService userService;

	@GetMapping("/viewUser")
	public ResponseEntity<User> viewHotel(@RequestBody User user) {
		User userDetails = userService.viewUser(user);
		return new ResponseEntity<>(userDetails, HttpStatus.OK);
	}

	@PostMapping("/saveUser")
	public ResponseEntity<String> createUser(@RequestBody User user) {
		userService.saveUser(user);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PostMapping("/updateUser")
	public ResponseEntity<String> updateUser(@RequestBody User user) {
		userService.updateUser(user);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PostMapping("/cancelUser")
	public ResponseEntity<String> deleteUser(@RequestBody User user) {
		userService.deleteUser(user);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
