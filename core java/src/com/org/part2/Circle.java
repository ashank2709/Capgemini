package com.org.part2;

public class Circle {
	
	private static final double r = 0;
	private double radius;
	
	public Circle() {
	radius=1.0;
	}
	public Circle(double radius){
		
		radius=r;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void  setRadius(double radius) {
		this.radius=radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public double getCircumference() {
		return 2*Math.PI*radius;
	}
	public String toString() {
		
		return "Circle[(radius=2.0)]";
	}

}
