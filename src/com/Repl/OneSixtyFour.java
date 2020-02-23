package com.Repl;

import java.util.Scanner;

public class OneSixtyFour {

	public final String reverseString() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter text and i will print reverse of your entered text");
		String reverse = scan.nextLine();
		String reverseString = "";
		for (int i = reverse.length()- 1;  i >= 0;  i--) {
			reverseString = reverseString + reverse.charAt(i);
		}
		return reverseString;
	}

	public static void main(String[] args) {
		OneSixtyFour obj = new OneSixtyFour();
		System.out.println(obj.reverseString());

	}
}