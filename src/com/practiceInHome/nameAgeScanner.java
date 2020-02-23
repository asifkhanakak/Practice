package com.practiceInHome;

import java.util.Scanner;

public class nameAgeScanner {
	
	public static void main(String[]args){
	    
	    Scanner scan1=new Scanner(System.in);
	    System.out.println("Enter your name");
	    String name=scan1.nextLine();
	    
	    Scanner scan2=new Scanner(System.in);
	    System.out.println("Enter your mobile number");
	    int mobile=scan2.nextInt();
	    
	    Scanner scan3=new Scanner(System.in);
	    System.out.println("enter your age");
	    int age=scan3.nextInt();
	    
	    System.out.print("Your name is "+name+" your age is "+age+" your mobile numberis "+mobile);
	  
	    
	    
	  }

		
	 
	

}
