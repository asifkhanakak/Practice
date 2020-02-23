package com.practiceInHome;

public class QuizTest extends WhileIf{
	
	

	int t=220;

	public static  void main(String[] args) {
		
		QuizTest obj=new QuizTest();
				System.out.println("instance variable value in child class quiztest "+obj.t);
				WhileIf obj1=new WhileIf();
				System.out.println();
				System.out.println("instance variable value in parent  class WhileIf "+obj1.t);
				System.out.println("---------------------------------------------");
				System.out.println("method called in parent class");
				System.out.println();
				
				obj1.methd();
				//WhileIf.methd();

	}

}
