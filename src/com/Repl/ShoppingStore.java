package com.Repl;

public class ShoppingStore {
	
	 String item;
	  double price;
	  int quantity;
	  
	  ShoppingStore(String item, double price, int quantity){
	    
	    this.item=item;
	    this.price = price;
	    this.quantity = quantity;
	  }
	  
	  double itemtotalPrice(){
	    
	   double totalvalue= price * quantity;
	    System.out.println(item+" Total Value "+totalvalue);
	    return totalvalue;
	  }
	  

}
