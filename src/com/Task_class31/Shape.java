package com.Task_class31;

import java.util.Scanner;

/*Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter .
 *  Create 2 child classes: Circle & Square that should have an implementation of area and perimeter calculation.
 *   Test your code.
 */

public interface Shape {

	public double calculateArea(double radius,double length);

	public double calculatePerimiter(double radius,double length);
}

	class Circle implements Shape {
	
		double area;
		double perimiter;

		@Override
		public double calculateArea(double radius,double length) {
			area = (3.14 * radius * radius);
			return area;
		}

		@Override
		public double calculatePerimiter(double radius,double length) {
			perimiter = (2 * 3.14 * radius);
			return perimiter;
		}
}


	
  class Square implements Shape{
	  double area; double perimiter;  

	@Override
	public double calculateArea(double radius,double length) {
		
		area=(length*length);
		return area;
	}

	@Override
	public double calculatePerimiter(double radius,double length) {
		perimiter=4*length;
		return perimiter;
	}

  }	
	
	
