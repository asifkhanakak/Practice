package com.Repl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Riple_193 {
	/*Create a linkList of type Integer call list, 
	Add the values below. 
	111
	222
	333
	444
	555
	666

	Create a logic to calculate sum of the all the values in list. 

	Print the result only. 

	Output. 
	Result of sum is 2331*/


	public static void main(String[] args) {
		int x=0;
		List<Integer> list=new ArrayList<Integer>();
		for (int i=1; i<=6;i++) {
			for(int j=0;j<3;j++) {
				list.add(i);
			}
			x=x+list.get(i);
		}
		System.out.println(list);
		System.out.println(x);
		
		HashSet<String> colour=new HashSet<>();
		colour.add("red");
		System.out.println(colour);
		
		
		
		
		

	}

}
