package com.org.practice;

public class Testclass1 {
	
	static public void main(String[]arg) {
		class1 c1= new class1(1.1,"blue") ;
		System.out.println(c1);
		
		class1 c2= new class1(2.2);
		System.out.println(c2);
		
		class1 c3 =new class1();
		System.out.println(c3);
		
		
		
		c1.setRadius(3.1);
		c1.setColor("green");
		System.out.println(c1);
		System.out.println("the radius is:"+ c1.getRadius());
		System.out.println("the color is:"+ c1.getColor());
		System.out.println("the area is :"+ c1.getArea());
		System.out.println("the circumfernce is  :"+ c1.getCircumference());
	}

}
