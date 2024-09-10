package com.evergent.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda7MethodReference {
       //  ::  double colon operator in JAVA 8
	public static void main(String[] args) {
		 List<String> names =new ArrayList<String>(); 		 
		 names.add("Ramesh");
		 names.add("Mahesh");
		 names.add("Suresh");
		 names.add("Naresh");
		   		   
		 //  for(String n:names)
			//   System.out.println(n);
		   
		   //names.forEach(n->System.out.println(n));
		     
		   // or we can use  :: dobule colon operator in JAVA8
		 		     //names  n
            names.forEach(System.out::println);
		    
	}  }
