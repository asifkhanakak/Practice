package com.practiceInHome;

public class CastingPractice {

	public static void main(String[] args) {
	
		/*Assigning a value of one type to a variable
         of another type is known as Type Casting.*/
	int i1=100;
	            System.out.println(i1);
	double d1=i1;     //from int to double is no problem
	             System.out.println(d1);
	
	
		float f=2.3f;
               System.out.println(f);
       int i=(int)f;  // will have to change data type manually
               System.out.println(i);

	}

}
