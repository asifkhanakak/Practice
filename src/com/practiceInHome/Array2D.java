package com.practiceInHome;

public class Array2D {

	public static void main(String[] args) {

		int[][] my2DArray = { { 2, 3, 4, 5, 3, }, { 3, 1, 4, 5, 5 }, { 1, 2, 3, 4, 5, 6 } };

		for (int []rows : my2DArray) {
			for (int values : rows) {
				System.out.print(values + " ");
			} 
			System.out.println();
		}
	}

}
