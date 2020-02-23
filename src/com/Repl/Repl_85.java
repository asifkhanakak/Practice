package com.Repl;

public class Repl_85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[][] a = {
	            {1,1,1},
	            {1,1,1},
	            {1,1,1},
	            
	        };
	//should be true
	    System.out.println(a.length);
	    System.out.println(a[1].length);
	int rows=a.length;
	boolean isSquare= true;
	for(int i = 0; i< a.length; i++){
	    for(int j = 0; j < a[i].length; j++)
	        if(rows != a[i].length)
	            isSquare = false;
	} System.out.println(isSquare);
	}

}
