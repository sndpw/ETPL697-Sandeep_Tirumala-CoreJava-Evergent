package com.evergent.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda6ForEach {

	public static void main(String[] args) {
		
		List<String>mygames=new ArrayList<String>();
		
		
		mygames.add("Chees");
		mygames.add("Hocky");
		mygames.add("Kabbadi");
		mygames.add("Cricket");
		
		// ForEach Adv loop
		  for(String names:mygames)
		    System.out.println(names); 
	   	
	    mygames.forEach(t->System.out.println(t));
	
  
}
}