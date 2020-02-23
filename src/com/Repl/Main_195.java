package com.Repl;

import java.util.Iterator;
import java.util.LinkedHashSet;



public class Main_195 {
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> numbers=new LinkedHashSet<>();
		  numbers.add(111);
		  numbers.add(111);
		  numbers.add(111);
		  numbers.add(999);
		  numbers.add(999);
		  numbers.add(999);
		  
		  Iterator<Integer> it=numbers.iterator();
		  while(it.hasNext())
		  System.out.println(it.next());
	}

}
