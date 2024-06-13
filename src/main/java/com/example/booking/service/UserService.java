package com.example.booking.service;

import com.example.booking.model.Hotel;
import com.example.booking.model.User;

public interface UserService {

	User viewUser(User user);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUser(User user);

}
