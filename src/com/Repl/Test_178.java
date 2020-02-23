package com.Repl;

public class Test_178 implements Funcations_178{
        @Override
	public double adding(double firstNumber, double secondNumber) {
		return (firstNumber + secondNumber);
		
	}

	public double subtracting(double firstNumber, double secondNumber) {
		return (firstNumber - secondNumber);
	
	}

	public double multiply(double firstNumber, double secondNumber) {
		return  (firstNumber * secondNumber);
		
	}

	public double dividing(double firstNumber, double secondNumber) {
		return (firstNumber / secondNumber);
		
	}

	public void display(double result) {
		System.out.println(result);
	}

	public static void main(String[] args) {

		double firstNumber = 100.00;
		double secondNumber = 20.00;
		double result;

		Test_178 obj = new Test_178();
		result=obj.adding(firstNumber, secondNumber);
		obj.display(result);
		
		result=obj.subtracting(100,20);
		obj.display(result);
		
		result=obj.multiply(firstNumber, secondNumber);
		obj.display(result);
		
		result=obj.dividing(100, 20);
		obj.display(result);
	}

}
