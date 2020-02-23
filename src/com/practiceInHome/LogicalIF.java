package com.practiceInHome;

import java.util.Scanner;

public class LogicalIF {

	public static void main(String[] args) {
		Scanner scan;
	    int int1,int2;
	    String word1,word2;
	    
	    scan=new Scanner(System.in);
	    System.out.println("Please enter two strings and two integers ");
	    
	    word1=scan.next();
	    word2=scan.next();
	    int1=scan.nextInt();
	    int2=scan.nextInt();
	    
	    if((int1==int2) || (word1.equals(word2))){
	      System.out.println("AND");
	    }else{
	      System.out.println("false");
	    }

	}

}
