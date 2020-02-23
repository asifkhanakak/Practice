package com.Repl;
import java.util.*;
public class Repl_211 {

	public static void main(String[] args) {
		
		List<Map<String,Object>> dataList=new ArrayList<>();
	    
	    Map<String,Object> appleMap=new LinkedHashMap<>();
	    appleMap.put("Items", "Apple");
	    appleMap.put("Price", 20.00);
	    appleMap.put("Quantity", 10);
	    
	    dataList.add(appleMap);
	    
	    Map<String,Object> orangeMap=new LinkedHashMap<>();
	    orangeMap.put("Items", "Orange");
	    orangeMap.put("Price", 21.99);
	    orangeMap.put("Quantity", 10);
	    
	    dataList.add(orangeMap);
	    
	     double subTotal, purchaseTotal=0;
	     
	     for(Map<String,Object> ent : dataList){
	      for(String key : ent.keySet()){
	        System.out.println(key+" : "+ent.get(key));
	      }
	      double price=(double)ent.get("price");
	     double quantity=(double)ent.get("quantity");
	      
	      subTotal=price*quantity;
	      System.out.println("SubTotal: "+subTotal);
	      purchaseTotal+=subTotal;
	    }
	    System.out.println("Your Purchase total : "+purchaseTotal);
	  }
	}
