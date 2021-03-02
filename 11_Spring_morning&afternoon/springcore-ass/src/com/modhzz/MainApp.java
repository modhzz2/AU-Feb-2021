package com.modhzz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(App_config.class);

		Rectangle rectangle = (Rectangle) context.getBean("RectangleObject");
		rectangle.draw();
		rectangle.drawL();

	}
}
