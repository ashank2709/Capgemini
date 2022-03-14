package com.org.practice;

public class class1 {
	
	public static final double DEFAULT_radius=1.0;
	public static final String DEFAULT_color="red";
	
	private double radius;
	private String color;
	
	public class1() {
		this.radius=DEFAULT_radius;
		this.color=DEFAULT_color;
		
	}
	public class1(double radius) {
		this.radius=radius;
		this.color=DEFAULT_color;
		
	}
	
		public class1(double radius, String color) {
		this.radius=radius;
		this.color=color;
	}
		public double getRadius() {
		return radius;	
		}
		
		public void setRadius(double radius) {
			this.radius=radius;
		}
		public String getColor() {
			return color;
		}
		
		public void setColor(String color) {
			this.color=color;
		}
		
		public String toString() {
			return "circle1[radius="+radius+",color=" +color +"]";
			
		}
		
		public double getArea() {
			
			return Math.PI*radius*radius;
		}
		
		public double getCircumference() {
			return 2*Math.PI*radius;
		}

}
