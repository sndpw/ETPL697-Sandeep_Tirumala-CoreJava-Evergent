package com.evergent.coreJAVA.stack;

import java.util.Stack;

public class Stack_Demo3 {

	public static void main(String[] args) {
		Stack mystack = new Stack();
		mystack.push("Red");
		mystack.push("Black");
		mystack.push("White");
		
		System.out.println(mystack.search("Red"));
	}

}
