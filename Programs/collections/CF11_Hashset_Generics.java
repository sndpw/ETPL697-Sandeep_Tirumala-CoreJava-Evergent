package com.evergent.coreJAVA.collections;

import java.util.HashSet;
import java.util.Iterator;

public class CF11_Hashset_Generics {
	public static void main(String[] args) {
		
		HashSet<String> myList = new HashSet<>();
		myList.add("mango");
		myList.add("banana");
		myList.add("apple");
		myList.add("grapes");
		
		System.out.println(myList);
		
		Iterator i = myList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		for(String l : myList) {
			System.out.println(l);
		}
	}
}
