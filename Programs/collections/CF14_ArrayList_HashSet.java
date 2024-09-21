package com.evergent.coreJAVA.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class CF14_ArrayList_HashSet {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("CoreJava");
		list.add("J2EE");
		list.add("J2SE");
		list.add("MyJava");
		list.add("Graphs");
		System.out.println(list);
		HashSet<String> s=new HashSet<>();
		s.addAll(list);
		HashSet<String> s1=new HashSet<>();
		s1.add("CoreJava");
		s1.add("J2EE");
		s1.add("J2SE");
		s1.add("MyJava");
		s1.add("Graphs");
		s1.add("CoreJava");
		if(s.equals(s1)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not Same");
		}
		System.out.println(s.containsAll(s1));
	}
}