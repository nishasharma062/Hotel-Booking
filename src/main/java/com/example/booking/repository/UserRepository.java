package com.example.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.booking.model.User;

public interface  UserRepository extends JpaRepository<User , Integer>{

}
