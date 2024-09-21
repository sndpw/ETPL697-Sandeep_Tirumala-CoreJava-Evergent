package com.evergent.coreJAVA.stack;

import java.util.*;

public class Stack_Demo6 {

	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		st.push("Red");
		st.push("Black");
		st.push("White");

		Enumeration e = st.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		Iterator i1 = st.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

		for (String s : st) {
			System.out.println(s);
		}
	}

}