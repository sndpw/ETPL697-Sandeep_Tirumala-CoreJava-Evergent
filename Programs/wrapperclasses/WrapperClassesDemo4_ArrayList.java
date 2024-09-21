package com.evergent.coreJAVA.wrapperclasses;

import java.util.ArrayList;

public class WrapperClassesDemo4_ArrayList {

	public static void main(String[] args) {
		// AutoBoxing
		int a = 10;
		Integer i1 = new Integer(a);
		ArrayList myList = new ArrayList();
		myList.add(i1);
		System.out.println(myList);
		Integer i2 = new Integer(100);
		myList.add(i2);
		System.out.println(myList);
		myList.add(new Double(25.7));
		System.out.println(myList);
		System.out.println(myList.get(0));
		
		//JDK 1.5
		ArrayList myList1 = new ArrayList();
		myList1.add(100); //autoboxing
		System.out.println(myList1.get(0)); //auto-unboxing
	}
}
