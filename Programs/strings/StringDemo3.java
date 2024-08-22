package com.evergent.coreJAVA.strings;

public class StringDemo3 {

	public static void main(String[] args) {
		String name = new String("    Hello World");
		
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.trim()); //trims spaces on left side
	}
}
