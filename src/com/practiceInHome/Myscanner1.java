package com.practiceInHome;


	import java.util.Scanner;
	 class Myscanner1 {
	
	  public static void main(String[]args){
	    
	    Scanner scan= new Scanner(System.in);
	    System.out.println("Please enter your first name");
	    String firstName=scan.nextLine();
	    System.out.println("please enter Surname");
	    Scanner scan1=new Scanner(System.in);
	    String surName=scan1.next();
	    System.out.println(firstName+" "+surName);
	    
	  }
	  
	}

