package com.practiceInHome;

public class PracticeConst {
	
	private  PracticeConst() {
		System.out.println("const with no args");
	}
	protected PracticeConst(String var) {
		System.out.println("string argument const "+var);
	}
	public static void main(String[]args) {
		
		PracticeConst obj1= new PracticeConst();
		PracticeConst obj2=new PracticeConst("hello");
	}

}
