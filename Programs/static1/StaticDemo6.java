package com.evergent.coreJAVA.static1;

public class StaticDemo6 {
	static String name = "Raj"; //static variable
	int age = 21;
	String address = "Hyderabad";
	
	public void display(){
		name = "Kiran";
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
	}
	
	public static void main(String[] args) {
		StaticDemo6 p1 = new StaticDemo6();
		System.out.println(name);
		p1.display();
		System.out.println(name);
	}
}
