package com.Repl;

public class OneThirtyFive {
	 static  int age=50;
	  static String name;
	  
	  static void methd(){
	    age=40;
	    name="John";
	    System.out.println(age);
	    System.out.println(name);
	  }
	  
	  public static void main(String[] args) {
	   methd();
	    System.out.println(age);
	    
	    OneThirtyFive obj=new OneThirtyFive();
	    obj.age=60;
	    System.out.println(obj.age);
	  }

}
