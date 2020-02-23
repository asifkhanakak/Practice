package com.practiceInHome;

public class Mixed_task1 {

	public static void main(String[] args) {
		
		int number1=0; int number2=0; int sum=1;
		
		for (int i=0; i<10; i++) {
			number1=number2;
			number2=sum;
			sum=number1+number2;
			System.out.print(number1+" ");
		}
		
		
		
		
		

	}

}
