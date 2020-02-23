package com.practiceInHome;

import java.util.*;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		System.out.println(list.isEmpty());
		list.add("Asif");
		list.add(1, "element");
		list.add("khan");
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.get(2));
		list.remove(1);
		System.out.println(list);
		list.remove("Asif");
		System.out.println(list);
		
		Iterator<String> it=list.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
		
		
		
	}

}
