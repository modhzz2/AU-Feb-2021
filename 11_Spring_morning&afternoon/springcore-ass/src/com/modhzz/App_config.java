package com.modhzz;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App_config {
	@Bean(name="RectangleObject")
	public Rectangle getRectangle() {
		return new Rectangle(10, 30);
	}
	
	@Bean(name = "point1")
	public Point getpoint1() {
		return new Point(0, 0);
	}

	@Bean(name = "point2")
	public Point getpoint2() {
		return new Point(0, 10);
	}

	@Bean(name = "point3")
	public Point getpoint3() {
		return new Point(30, 0);
	}

	@Bean(name = "point4")
	public Point getpoint4() {
		return new Point(30, 10);
	}
	
	@Bean(name="list")
	public ArrayList <Point> getPoints(){
		ArrayList <Point> pL=new ArrayList <Point>();
		pL.add(new Point(0, 0));
		pL.add(new Point(0, 50));
		pL.add(new Point(30, 0));
		pL.add(new Point(30, 50));
		return pL;
	}

}
