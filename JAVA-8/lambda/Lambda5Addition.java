package com.evergent.java8.lambda;
@FunctionalInterface 
 interface Add1
 {
	 public abstract  int addition(int a,int b);
 }       

public class Lambda5Addition {

	public static void main(String[] args) {
		 
		Add1 add = ( a, b)->
		{
			int sum = a+b;
			 	
			 return sum;
		};
		
      int t =  add.addition(2,5);
        System.out.println("Addition :"+t);
        		
	}

} 
