package com.evergent.coreJAVA.collections;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo5 {
	public static void main(String[] args) {
		TreeSet mySet = new TreeSet();
		mySet.add(100);
		mySet.add(45);
		mySet.add(100);
		mySet.add(20);
		System.out.println(mySet);
		
		Iterator i = mySet.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
