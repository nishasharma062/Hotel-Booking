package com.example.booking.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rooms {
	    int roomId; 
	    int hotelId; 
	    String roomType; 
	    String roomStatus; 
}
