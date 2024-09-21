package com.evergent.coreJAVA.collections.map;

import java.util.HashMap;

public class HashMapDemo3 {

	public static void main(String[] args) {
		HashMap<String, String> mymap = new HashMap<>();
		
		mymap.put("India", "Delhi");
		mymap.put("USA",  "Washington DC");
		mymap.put("Germany",  "Berlin");
		System.out.println(mymap);
		
		for(String i : mymap.keySet()) {
			System.out.println(i);
		}
	}

}
