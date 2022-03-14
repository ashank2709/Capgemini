package com.org.part2;

public class TestCircle {
	static public void main (String[]arg) {
		
		Circle c1= new Circle();
		System.out.println("the radius of circle:"+c1.getRadius());
		System.out.println("the area of circle:"+c1.getArea());
		System.out.println("the circumfernec ="+c1.getCircumference());
		
		Circle c2= new Circle(2.0);
		System.out.println("the radius of circle:"+c2.getRadius());
		System.out.println("the area of circle:"+c2.getArea());
		System.out.println("the circumfernec ="+c2.getCircumference());
		
		
		
		Circle c3=new Circle();
		System.out.println(c3.toString());
	}

}
