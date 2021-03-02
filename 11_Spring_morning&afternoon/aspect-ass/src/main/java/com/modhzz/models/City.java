package com.modhzz.models;

public class City {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("After setting City name");
	}

}
