package com.Repl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main_192 {
	
	/*Create a method the return an LinkList. without parameters. 
			inside the method put the logic to add below values to the linklist and return the list. 

			In Main Class. 
			call the method and store it to a new Linklist. 

			Print the values of LinkList. 

			Output

			John
			Brian
			Ryan*/
	public LinkedList<String> tsest() {
		LinkedList<String> link=new LinkedList<>();
		link.add("John");
		link.add("Brain");
		link.add("Ryan");
		return  link;
		
	}
	
	public static void main(String[] args) {
		
		Main_192 obj=new Main_192();
		List<String> val=obj.tsest();
		
		for(String values:val) {
		System.out.println(values);}
	}

}
