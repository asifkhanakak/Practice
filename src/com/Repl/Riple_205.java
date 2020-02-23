package com.Repl;
import java.util.*;
public class Riple_205 {
	
	public static void main(String[]args){
	    
	    Map<String,String> data=new LinkedHashMap<>();
	    
	    data.put("Street","Patrick St");
	    data.put("Suite","265");
	    data.put("City","Vienna");
	    data.put("Zip","22180");
	    data.put("ountry","United State");
	    
	    Set<String> keys=data.keySet();
	    
	    Iterator<String> it=keys.iterator();
	    while(it.hasNext()){
	      String key=it.next();
	      System.out.println(key);
	    }
	    
	    
	  }
	 

}
