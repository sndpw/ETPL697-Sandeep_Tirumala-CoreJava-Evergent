package com.evergent.coreJAVA.collections;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet mySet = new HashSet();
		mySet.add(100);
		mySet.add("hello");
		mySet.add(45.5);
		mySet.add(100);
		mySet.add("Welcome");
		System.out.println(mySet);
	}
}
