package com.class32;

import java.util.ArrayList;

public class Task {

	public static void main(String[] args) {
		
		ArrayList<Integer> objArr=new ArrayList<Integer>();
		objArr.add(20);
		objArr.add(30);
		objArr.add(40);
		objArr.add(50);
		objArr.add(60);
		System.out.println(objArr);
		
	System.out.println(objArr.isEmpty());	
	System.out.println(objArr.contains(20));
	System.out.println(objArr.size());
	
	ArrayList mix=new ArrayList();
	mix.add("Asif");
	mix.add(1, 20);
	mix.add('A');
	mix.add(true);
	System.out.println(mix);
		
	}

}