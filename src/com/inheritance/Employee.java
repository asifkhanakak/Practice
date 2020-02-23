package com.inheritance;

public class Employee extends Persons {
	
	int salary;
	  
	 public void print1(String name,String lastName,int age,int salary){
	    
	    System.out.println(name+" "+lastName+" "+age+" "+salary);
	  }

}
