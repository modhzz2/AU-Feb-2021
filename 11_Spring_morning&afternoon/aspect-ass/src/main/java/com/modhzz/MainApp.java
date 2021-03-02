package com.modhzz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.modhzz.services.LocationService;

public class MainApp {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		LocationService locationService = (LocationService) ctx.getBean("locationService");

		locationService.getCity().setName("Baroda");
		System.out.println(locationService.getCity().getName());

		// locationService.getCountry().setName("India ");

	}
}
