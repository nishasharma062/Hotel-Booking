package com.example.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.booking.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel , Integer>{

}
