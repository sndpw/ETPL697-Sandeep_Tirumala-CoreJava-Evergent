package com.evergent.java8.lambda;

 interface Add2
 {
	 public abstract  int addition(int a,int b);
 }       

public class MyAddition {
	
	 public   int addition(int a,int b) {
		 return a+b;
		 
	 }

	public static void main(String[] args) {
		 
		MyAddition m=new MyAddition();
		
		int sum =m.addition(2,3);
		System.out.println(sum);
		
		
      
	}

} 
