package com.example.booking.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {
	
	@Id
	public Integer HotelId;
	
	public String HotelName;
	
	public Address address;
	
	public Integer hotelRating;
	
	public List<Rooms> rooms;

}
