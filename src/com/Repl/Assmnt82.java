package com.Repl;

public class Assmnt82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
			
			//Double and print array
			
		
	       for (double d[]: a){
			  for (double j:d){
			    System.out.print (j+" ");
			  }
			  System.out.println();
			}
		System.out.println(a.length);
		System.out.println(a[1].length);
		System.out.println(a[2][0]);
		
		
		
		
	}

}
