package com.practiceInHome;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {

		Scanner scan;
		String gender;
		int age;
		String output;

		scan = new Scanner(System.in);

		gender = scan.next();
		age = scan.nextInt();

		if (age > 25) {
			if (gender.equals("M")) {
				System.out.println("Man");
			} else {
				System.out.println("Woman");
			}
		} else {
			if (gender.equals("M")) {
				System.out.println("Boy");
			} else {
				System.out.println("Girl");
			}
		}

	}

}
