package com.practiceInHome;

import java.util.Scanner;

public class IfBoolean2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Are you thirsty?");
		boolean thirsty = scan.nextBoolean();
		System.out.print("Are you sleepy?");
		boolean sleepy = scan.nextBoolean();
		String drink="null";

		if ((thirsty) && (sleepy)) {
			System.out.println("drink=Cofee");
			drink = "Cofee";
			System.out.println("Looks like you need "+drink);
		} else if ((thirsty) && (!sleepy)) {
			System.out.println("drink=Water");
			drink = "Water";
			System.out.println("Looks like you need "+drink);
		} else if ((!thirsty) && (sleepy)) {
			System.out.println("drink=Tea");
			drink = "Tea";
			System.out.println("Looks like you need "+drink);
		}else {
		System.out.println("Nothing");
		  
		}System.out.println("look likw"+drink);
	}}
		

	


