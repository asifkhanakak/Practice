package com.Repl;

import java.util.Scanner;

public class Seventy7 {

	public static void main(String[] args) {
		
		String[] day=new String[7];
		Scanner scan=new Scanner(System.in);


		for (int i = 0; i <day.length; i++) {

			System.out.println("Please enter day " + (i+1) + " of the week");
			day[i] = scan.next();
		}
		
		
		for(int i=0; i<=day.length-1; i++){
			System.out.println(day[i]);
		}
		
		scan.close();
	}
	
}
