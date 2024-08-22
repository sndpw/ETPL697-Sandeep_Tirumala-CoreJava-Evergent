package com.evergent.coreJAVA.static1;

public class StaticDemo5 {
	static String cname = "India";
	String name = "Raj"; //non-static variable
	
	static {
		System.out.println("Static Block");
	}
	
	public static void main(String[] args) {
		System.out.println(cname);
	}
}
