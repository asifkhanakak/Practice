package com.practiceInHome;

public class WhileIf {
	
	int t=100;
	public WhileIf()
	{
		System.out.println();
		System.out.println("I am created in WhileIf class constructor");
	}
	
	
	protected final static int methd() {
		
         int i=1;
		
		while(i<=10) {
			if((i!=5)&&(i!=7)&&(i!=8)){
				System.out.print(i+" ");
			}		
             i++;
	}
		return i;
	}
	

	public static void main(String[] args) {
		
		int i=1;
		
		while(i<=10) {
			if((i!=5)&&(i!=7)&&(i!=8)){
				System.out.println(i);
			}		
             i++;
	}

}}
