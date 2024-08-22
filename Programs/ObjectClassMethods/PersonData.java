package com.evergent.coreJAVA.ObjectClassMethods;

class Person1 {
	String name;
	int age;
	
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() { //to get object info we override the toString() method
		return name + " " + age;
	}
}
public class PersonData {

	public static void main(String[] args) {
		Person1 p = new Person1("Raj", 30);
		System.out.println(p);
	}
}
