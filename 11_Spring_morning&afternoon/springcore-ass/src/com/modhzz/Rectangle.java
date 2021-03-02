package com.modhzz;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Rectangle {
	private int l;
	private int b;
	
	@Autowired
	@Qualifier("point1")
	private Point pointA; 
	
	@Autowired
	@Qualifier("point2")
	private Point pointB; 
	
	@Autowired
	@Qualifier("point3")
	private Point pointC; 
	
	@Autowired
	@Qualifier("point4")
	private Point pointD; 

	@Autowired
	@Qualifier("list")
	private ArrayList<Point> newList;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public Point getPointD() {
		return pointD;
	}
	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}
	
	public ArrayList<Point> getNewList() {
		return newList;
	}
	public void setNewList(ArrayList<Point> newList) {
		this.newList = newList;
	}
	
	public Rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public void draw() {
		System.out.println("The given rectangle has a length of: " + getL() + " and a breadth of " + getB());
		System.out.println("The fours points of the rectangle :");
		System.out.println("Point 1: " + getPointA().getX() + " , " + getPointA().getY());
		System.out.println("Point 2: " + getPointB().getX() + " , " + getPointB().getY());
		System.out.println("Point 3: " + getPointC().getX() + " , " + getPointC().getY());
		System.out.println("Point 4: " + getPointD().getX() + " , " + getPointD().getY());
	}
	
	public void drawL() {
		System.out.println("The given rectangle has a length of: " + getL() + " and a breadth of " + getB());
		System.out.println("The fours points of the rectangle :");
		System.out.println("Point 1: " + getNewList().get(0).getX() + " , " + getNewList().get(0).getY());
		System.out.println("Point 2: " + getNewList().get(1).getX() + " , " + getNewList().get(1).getY());
		System.out.println("Point 3: " + getNewList().get(2).getX() + " , " + getNewList().get(2).getY());
		System.out.println("Point 4: " + getNewList().get(3).getX() + " , " + getNewList().get(3).getY());
	}
}
