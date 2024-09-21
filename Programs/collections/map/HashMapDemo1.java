package com.evergent.coreJAVA.collections.map;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap mymap = new HashMap();

		mymap.put(100, "Ramesh");
		mymap.put(200, "Bhanu");
		mymap.put(300, "Abbas");
		mymap.put(null, "Ram");
		mymap.put(700, null);

		System.out.println(mymap);
	}

}
