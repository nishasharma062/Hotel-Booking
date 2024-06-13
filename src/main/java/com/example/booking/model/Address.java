package com.example.booking.model;

import javax.persistence.Entity;

@Entity
public class Address {
	
	public Integer addressId;
	
	public String HouseNo;
	
	public String StreetName;
	
	public String cityName;

	public String countryName;

}
