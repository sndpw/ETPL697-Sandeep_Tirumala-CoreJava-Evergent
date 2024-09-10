package com.evergent.java8.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamAPI4_skip {

	public static void main(String[] args) {
		        
		List<Integer> listInt=Arrays.asList(11,33,44,5,66,44,5);
		
				
		listInt.stream().skip(5).forEach(System.out::println);

	} 
}
