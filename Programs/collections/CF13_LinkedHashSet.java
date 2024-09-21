package com.evergent.coreJAVA.collections;

import java.util.LinkedHashSet;

public class CF13_LinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> list = new LinkedHashSet<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Mango");
		list.add("Graphs");
		System.out.println(list);
		list.add("Mangoes");
		for(String obj:list) {
			System.out.println(obj);
		}
		System.out.println(list.contains("Apple"));
		list.remove("Banana");
		System.out.println("After Removing Banana :"+list);
		System.out.println("The Length of List :"+list.size());
		list.clear();
		System.out.println("After Clearing Elements :"+list);
	}
}