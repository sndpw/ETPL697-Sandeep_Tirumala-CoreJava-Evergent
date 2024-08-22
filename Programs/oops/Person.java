package com.evergent.coreJAVA.oops;
//Encapsulation example
public class Person {
	String name = "Sandeep";
	int age = 21;
	String address = "Hyderabad";
	
	public void display() {
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
		System.out.println("Address :" + address);
	}
	
	public static void main(String[] args) {
		Person p = new Person();//object creation
		p.display();//method calling
	}
}
