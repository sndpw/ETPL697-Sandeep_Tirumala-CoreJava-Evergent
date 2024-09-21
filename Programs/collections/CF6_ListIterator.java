package com.evergent.coreJAVA.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CF6_ListIterator {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("ramu");
		list.add("ravi");
		list.add("balu");
		list.add("bhanu");
		ListIterator li = list.listIterator();
		li.add("Welcome");
		
		while(li.hasNext()){
			String s = (String)li.next();
			System.out.println(s);
			if(s.equals("balu")){
				li.remove();
			}
		}
		
		while(li.hasNext()) {
			System.out.println(li.previous());
		}
		
	}
}
