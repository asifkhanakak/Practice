package com.Task_class31;

public class Task3 {

	/*
	 * Create Registration Class in which you would have variables as email,
	 * userName and password that have an access scope only within its own class.
	 * After creating an object of the class user should be able to call methods and
	 * in each method separately pass values to set users email, username and
	 * password. 
	 * Requirements: 
	 * A.Valid email consider to be only gmailB. Valid
	 * userName and password cannot be empty and should be of length larger than 6
	 * characters. Also valid password cannot contain userName.
	 */
	
//Teacher solution is at com.class32; Registration Class
	
	private String email, userName, password;

	public void verify(String email, String userName, String password) {
		this.userName = userName;
		this.password = password;
		this.email = email;
		if (email.contains("gmail")) {
			System.out.println("Valid email Account");
		} else {
			System.out.println("InValid email Account. Only gmail is valid email account");
		}
		if (userName.isEmpty()||(password.isEmpty())) {
			System.out.println("username or Password can not be empty");
		}
		if (userName.length()<6) {
			System.out.println("Usename can not be less then six corrector");
		}
		if(userName.equalsIgnoreCase(password)) {
			System.out.println("Password and username can not be the same");
		}
	}
	public static void main(String[] args) {
		Task3 obj=new Task3();
		obj.verify("ak@yahoo.com", "AsifKhan", "khan1234");
		System.out.println(obj.email);  // we can access private member in the same class,will not be able to access
	    System.out.println(obj.password); // it from another class without using getter,setter methods
	}
}
