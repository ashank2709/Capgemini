package com.org.practice;

public class Testcircle {
	
	static public void main(String[]arg) {
		circle c1= new circle(2.0,"blue");// use 3rd constructor
		System.out.println("the radius is: "+ c1.getRadius());
		System.out.println("the color is:"+ c1.getColor());
		System.out.printf("the area is : %.2f%n", c1.getArea());
		
		circle c2 = new circle(2.0);  // Use 2nd constructor
	      System.out.println("The radius is: " + c2.getRadius());
	      //The radius is: 2.0
	      System.out.println("The color is: " + c2.getColor());
	      //The color is: red
	      System.out.printf("The area is: %.2f%n", c2.getArea());
	      //The area is: 12.57

	      // Declare and Construct yet another instance of the Circle class called c3
	      circle c3 = new circle();  // Use 1st constructor
	      System.out.println("The radius is: " + c3.getRadius());
	      //The radius is: 1.0
	      System.out.println("The color is: " + c3.getColor());
	      //The color is: red
	      System.out.printf("The area is: %.2f%n", c3.getArea());
	      //The area is: 3.14
	      
	      circle c4= new circle();
	      System.out.println(c4.toString());
	}
	
	
	   

}
