package com.Task_class31;

public class Car {

	/*
	 * Create a Class Car that would have the following fields: carPrice and color
	 * and method calculateSalePrice() which should be returning a price of the car.
	 * Create 2 sub classes: Sedan and Truck. The Truck class has field as weight
	 * and has its own implementation of calculateSalePrice() method in which
	 * returned price calculated as following: if weight>2000 then returned price
	 * car should include 10% discount, otherwise 20% discount. The Sedan class has
	 * field as length and also does it is own implementation of
	 * calculateSalePrice(): if length of sedan is >20 feet then returned car price
	 * should include 5% discount, otherwise 10% discount
	 */

	public double carPrice;
	public String color;

	Car(double carPrice) {
		this.carPrice = carPrice;
	}

	public double priceCalculator() {
		return carPrice;
	}
}

class Truck extends Car {
	Truck(double carPrice, int weight) {
		super(carPrice);
		this.weight = weight;
	}

	int weight;

	@Override
	public double priceCalculator() {
		if (weight > 2000) {
			carPrice = (int) carPrice - (carPrice * 0.1);
		} else {
			carPrice = (int) carPrice - (carPrice * 0.2);
		}

		return carPrice;
	}
}

class Sedan extends Car {

	int length;

	Sedan(double carPrice, int length) {
		super(carPrice);
		this.length = length;
	}

	@Override
	public double priceCalculator() {
		if (length > 20) {
			carPrice = carPrice - (carPrice * 0.05);
		} else {
			carPrice = carPrice - (carPrice * 0.1);
		}
		return carPrice;
	}
}
