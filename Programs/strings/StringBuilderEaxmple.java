package com.evergent.coreJAVA.strings;

public class StringBuilderEaxmple {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		
		//append a string
		sb.append(" World");
		System.out.println("After append :" + sb);
		//insert a string at a specific location
		sb.insert(6, "Beautiful ");
		System.out.println("After insert :" + sb);
		//replace a substring
		sb.replace(0, 5, "Hi");
		System.out.println("After replace :" + sb);
		//delete a substring
		sb.delete(0, 3);
		System.out.println("After delete :" + sb);
		//reverse the string
		sb.reverse();
		System.out.println("After reverse :" + sb);
		//capacity of buffer
		System.out.println("Capacity :" + sb.capacity()); //by default 16 capacity after reaching capacity it increases by (old capacity * 2) + 2
		//length
		System.out.println("Length :" + sb.length());
		
	}
}
