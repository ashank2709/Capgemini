package com.org.practice;

public class circle {
	
	private double radius;
	private String color;
	
	public circle() {
		radius=1.0;
		color="blue";
		
	}
	
	public circle(double r) {
		radius=r;
		color="red";
		
	}
	public circle(double r , String c) {
		radius=r;
		color="c";
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}

}
