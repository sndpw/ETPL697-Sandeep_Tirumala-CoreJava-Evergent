package com.evergent.coreJAVA.static1;

public class StaticDemo2 {
	static String cname = "India";
	String name = "Raj"; //non-static variable
	
	static public void myData() {
		System.out.println("My Data");
	}
	
	public void show(){ //non-static method
		System.out.println("Show Method");
	}
	
	public static void main(String[] args) {
		System.out.println(cname);
		myData();
	}
}
