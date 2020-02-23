package com.Task_class31;

public class CarTest {

	public static void main(String[] args) {
		
		Car car=new Car(100000);
		System.out.println("Regular Price = "+car.priceCalculator());
		
		Truck truck=new Truck(10000,35);
		
		int price=(int) truck.priceCalculator();
		System.out.println("Truck price after discount = "+price);
		
		Sedan sedan=new Sedan(10000,20);
		int price2=(int) sedan.priceCalculator();
		System.out.println("sedan price after discount = "+price2);
		

	}

}
