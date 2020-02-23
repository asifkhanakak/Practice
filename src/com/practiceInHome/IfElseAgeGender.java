package com.practiceInHome;

import java.util.Scanner;

public class IfElseAgeGender {

	public static void main(String[] args) {
		Scanner scan;
	    String gender;
	    int  age;
	    String output;
	    
	    scan=new Scanner(System.in);
	    System.out.print("Enter M or F and input age");
	    gender=scan.next();
	    age=scan.nextInt();
	    
	    if((age>25)&&(gender.equals("M"))){
	      output="Man";
	      System.out.println(output);
	    }else if((age>25)&&(gender.equals("F"))){
	      output="Women";
	      System.out.println(output);
	    }else if((age<=25)&&(gender.equals("M"))){
	    output="Boy";
	    System.out.println(output);
	    }else if((age<=25)&&(gender.equals("F"))){
	      output="Girl";
	      System.out.println(output);
	    }
	}

}
