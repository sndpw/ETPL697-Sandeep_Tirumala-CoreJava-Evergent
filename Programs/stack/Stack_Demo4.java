package com.evergent.coreJAVA.stack;

import java.util.Stack;

public class Stack_Demo4 {

	public static void main(String[] args) {
		Stack mystack = new Stack();
		mystack.push("Red");
		mystack.push("Black");
		mystack.push("White");
		
		boolean b = mystack.isEmpty();
		System.out.println(b);
		System.out.println(mystack);
	}

}
