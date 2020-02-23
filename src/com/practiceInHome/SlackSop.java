package com.practiceInHome;

import java.util.Scanner;

public class SlackSop {

	public static void main(String[] args) {
		
		
		String [] days= new String[8];
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <=7; i++) {
            System.out.println("Please enter day "+i +" of the week");
            days[i]=scan.nextLine();
        }
        for (int i=1; i<=7; i++) {
            System.out.println(days[i]);
        }

	}

}
