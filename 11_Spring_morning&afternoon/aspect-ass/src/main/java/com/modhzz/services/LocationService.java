package com.modhzz.services;

import com.modhzz.models.*;

public class LocationService {

	private City city;
	private Country country;

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
}
