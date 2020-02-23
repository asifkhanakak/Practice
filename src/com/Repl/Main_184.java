package com.Repl;

public class Main_184 {

	public static void main(String[] args) {
		
		Person_184 obj = new Person_184("Asif", "Khan", 10, 25, 1900, "123-45-6789");

		System.out.println(obj.getFirstName());
		System.out.println(obj.getLastName());
		System.out.println(obj.getbirthDay() + "/" + obj.getBirthMonth() + "/" + obj.getBirthYear());
		System.out.println(obj.getSsn());
		System.out.println("--------------------------------------");
		obj.formatBirthday();

	}

}
