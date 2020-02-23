package com.practiceInHome;

import java.util.Scanner;

public class ifLengthWidth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		  System.out.println("Please enter the length");
		  int length=scan.nextInt();
		  
		  System.out.println("Please enter the width");
		  int width=scan.nextInt();
		  
		  if (length==width) {
		        System.out.println("the shape of your object is square");
		  } else{
		    System.out.println("The shape of your object is rectangle");
		  }
		}
		
	}


