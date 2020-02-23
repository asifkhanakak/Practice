package com.Repl;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main_199 {

	public static void main(String[] args) {
		
		Set<String> names=new HashSet<>();
		names.add(null);
		names.add("Asif");
		names.add("sumair");
		names.add("Khan");
		
		System.out.println(names);
		boolean val=names.contains(null);
		System.out.println(val);

	}

}
