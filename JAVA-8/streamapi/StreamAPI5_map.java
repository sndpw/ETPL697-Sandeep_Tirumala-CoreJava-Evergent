package com.evergent.java8.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamAPI5_map {

	public static void main(String[] args) {
		        
		List<Integer> listInt=Arrays.asList(1,2,3,4,5,6);
		
				
		listInt.stream().map(i->i*i).forEach(System.out::println);

	} 
}
