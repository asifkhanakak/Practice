package com.Repl;

public class Person_184 {
	private String firstname;
	private String lastname;
	private int birthmonth;
	private int birthday;
	private int birthyear;
	private String ssn;

	Person_184(String name, String lastName, int month, int day, int year, String ssN) {
		firstname = name;
		lastname = lastName;
		birthmonth = month;
		birthday = day;
		birthyear = year;
		ssn = ssN;
	}

	public String getFirstName() {
		return firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public int getBirthMonth() {
		return birthmonth;
	}

	public int getbirthDay() {
		return birthday;
	}

	public int getBirthYear() {
		return birthyear;
	}

	public String getSsn() {
		return ssn;
	}

	public void formatBirthday() {
		System.out.println(this.birthday+"/"+this.birthmonth+"/"+this.birthyear);
	}
}
