package com.evergent.coreJAVA.stack;

import java.util.Stack;

public class Stack_Demo5 {

	public static void main(String[] args) {
		Stack<String> mystack = new Stack<>();
		mystack.push("Apple");
		mystack.push("Banana");
		mystack.push("Cherry");
		mystack.push("Date");
		
		String topElement = mystack.peek();
		System.out.println(topElement);
		
		String removedElement = mystack.pop();
		System.out.println(removedElement);
		
		System.out.println(mystack);
		
		boolean isEmpty = mystack.isEmpty();
		System.out.println(isEmpty);

		int position = mystack.search("Banana");
		if(position != -1) {
			System.out.println(position);
		} else {
			System.out.println("Not in stack");
		}
		
		mystack.clear();
		System.out.println(mystack);
	}

}
