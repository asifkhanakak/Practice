package com.Repl;

public class OneThirtyEight {

	static int count = 0;

	static void mthd() {
		count++;
	}

	public static void main(String[] args) {
		System.out.println(count);
		
		new OneThirtyEight();
		new OneThirtyEight();
		new OneThirtyEight();

		OneThirtyEight.mthd();
		System.out.println(count);
		
		OneThirtyEight.mthd();
		System.out.println(count);
		
		OneThirtyEight.mthd();
		System.out.println(count);

		System.out.println(OneThirtyEight.count);
		

	}
}
