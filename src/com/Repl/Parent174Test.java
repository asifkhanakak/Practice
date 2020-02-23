package com.Repl;

public class Parent174Test implements Parent174 {
	     String a="asif";
	public Parent174Test(String a ) {
		this.a=a;
	}
	@Override
	public void method1() {
		System.out.println("implemented met  1");
	}

	@Override
	public void method2() {
		System.out.println("imilemented met 2");
		
	}
            
	public static void main(String[] args) {
		Parent174Test obj = new Parent174Test("Khan");
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method2(1);
		System.out.println(obj.a);
		
		
	}

	public void method2(int a) {
		System.out.println("methode overloaded in current class");

	}

	@Override
	public void method3() {
		System.out.println("implemented method3");
	}

}
