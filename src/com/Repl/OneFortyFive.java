package com.Repl;

public class OneFortyFive  {
	
	 
	public static void main(String[] args) {
	      ShoppingStore blancket = new ShoppingStore("Blancket" , 49.99, 2);
	      ShoppingStore mattress = new ShoppingStore("Mattress" , 219.59, 2);
	      
	   double item1 = blancket.itemtotalPrice();
	    double item2= mattress.itemtotalPrice();
	     
	     System.out.println("your total purchase= "+(item1+item2));
	      

}}
