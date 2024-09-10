package com.evergent.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class Lambda8MethodReference2 {

	public static void main(String[] args) {
		 
		List<Integer>mylist = Arrays.asList(1,2,3,4,5,6,7);
		//1		
		//System.out.println(mylist);
		
		//2.  For each Loop
		for(Integer n:mylist)
			System.out.println(n);
		
		//3. Lambda
		 mylist.forEach(n->System.out.println(n));
		 
		 //4. ::double colon opertor in JAVA8
		 mylist.forEach(System.out::println);
	} 
}
