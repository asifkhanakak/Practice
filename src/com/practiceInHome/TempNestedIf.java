package com.practiceInHome;

import java.util.Scanner;

public class TempNestedIf {

	public static void main(String[] args) {
		Scanner scan;
		boolean isSunny;
		int temp;
		
		scan=new Scanner(System.in);
		System.out.print("Is it sunny today ");
		isSunny=scan.nextBoolean();
		
		if(isSunny) {
			System.out.println("Its a sunny day,I should go somewhare");
			System.out.print("What is the temprature ");
			temp=scan.nextInt();
			if(temp>85) {
				System.out.println("I am going to the beach");
			}else {
				System.out.println("I am going to the park");
			}
		}else {
			System.out.println("I should stay home and practice java ");
		}

	

}}
