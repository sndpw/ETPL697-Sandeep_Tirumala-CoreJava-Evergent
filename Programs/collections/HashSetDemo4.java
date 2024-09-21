package com.evergent.coreJAVA.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo4 {

	public static void main(String[] args) {
		HashSet mySet = new HashSet();
		mySet.add(100);
		mySet.add("hello");
		mySet.add(45.5);
		mySet.add(100);
		mySet.add("Welcome");
		System.out.println(mySet);
		
		Iterator i = mySet.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
