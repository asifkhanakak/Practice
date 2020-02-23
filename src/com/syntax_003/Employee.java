package com.syntax_003;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {

	/*
	 * Create an ArrayList of Employee( id,name,address,sal) objects and search for
	 * particular Employee object based on id number and name.
	 */

	int empId;
	static int searchByidNo;
	int salary;
	String name, address;
	static String searchByName;

	Employee(int empId, String name, String address, int salary) {
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public void verifyId() {
		if (empId == searchByidNo) {
			System.out.println(
					"EmployeeID= " + empId + "   Name= " + name + "   Address=  " + address + "    Salary= " + salary);
		}
	}

	public  void verifyName() {
		if (name.equals(searchByName)) {
			System.out.println(
					"EmployeeID= " + empId + "   Name= " + name + "   Address=  " + address + "    Salary= " + salary);
		}
	}

	public static void main(String[] srgs) {

		ArrayList<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(101, "John", "123 main street", 90000));
		employeeList.add(new Employee(102, "Mark", "3456 pine street", 80000));
		employeeList.add(new Employee(103, "Chris", "4321 Virginia Ave", 70000));
		employeeList.add(new Employee(104, "Ali", "456 Arlington Dr", 60000));

		Employee.searchByidNo = 101;
		Employee.searchByName = "Chris";

		Iterator<Employee> it = employeeList.iterator();
		while (it.hasNext()) {
			Employee check = it.next();
			check.verifyName();
			check.verifyId();
		}
	}
}
