package com.inheritance;

public class Main {

	public static void main(String[] args) {
		
		
		Employee obj1=new Employee();
		Student obj2=new Student();
		Retiree obj3=new Retiree();
		
		obj1.print1("Joe","Smith",35,35000);
		obj2.print2("Adam","Smith",15,10);
		obj3.print3("Frank","Smith",15,"tour");
		}
	}


