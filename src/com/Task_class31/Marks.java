package com.Task_class31;

public abstract class Marks {
	
	/*We have to calculate the percentage of marks obtained in three subjects (each out of 100) 
	 * by student A and in four subjects (each out of 100) by student B.
	 *  Create class ‘Marks’ with an abstract method ‘getPercentage’. 
	 *  It is inherited by classes ‘A’ and ‘B’ each having a method with the same name which returns the percentage
	 *   of the students. The constructor of student A takes the marks in three subjects as its parameters
	 *    and the marks in four subjects as its parameters for student B. Test your code
	 */
	
	public abstract int getPercentage();
}

class A extends Marks{
	int english;  int maths;  int compScience; int percentage;
	
	A(int english,  int maths,  int compScience){
		this.english=english;
		this.maths=maths;
		this.compScience=compScience;
	}

	@Override
	public int getPercentage() {
		
		if((english>100)||(maths>100)||(compScience>100)) {
			System.out.println("obtained marks must be less then 100");
		}else {
		 percentage=((english+maths+compScience)/3);
		}
		return percentage;
	}
}


class B extends Marks{
    int	english; int maths;int compscience; int physics; int percentage;
    
	B(int english, int maths, int compscience, int physics){
		this.english=english;
		this.maths=maths;
		this.compscience=compscience;
		this.physics=physics;
	}
	@Override
	public int getPercentage() {
		
		if((english>100)||(maths>100)||(compscience>100)||(physics>100)) {
			System.out.println("obtained marks must be less then 100");
		}
		else {
		 percentage=((english+maths+compscience+physics)/4);
		}
		return percentage;
	}		
}	
