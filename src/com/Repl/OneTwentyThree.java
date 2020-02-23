package com.Repl;

public class OneTwentyThree {
	
		  
		  //String sub="";
		  static  String makeThreeSubstring(String word,int sIndex,int eIndex){
		      String sub="";
		      for(int i=0;i<3;i++) {
		      sub+= word.substring(sIndex,eIndex);
		      }
		      return sub;
		  }
			public static void main(String[]args){
				
			 String sub3=makeThreeSubstring("hello",0,2);
			  System.out.println(sub3);
			}
		}


