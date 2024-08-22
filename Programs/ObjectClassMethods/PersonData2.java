package com.evergent.coreJAVA.ObjectClassMethods;

class Person2 {
	String name;
	int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() { //to get object info we override the toString() method
		return name + " " + age;
	}
	
	public String myValue() {
		return name + " " + age;
	}
	
}
public class PersonData2 {

	public static void main(String[] args) {
		Person2 p = new Person2("Raj", 30);
		System.out.println(p);
		System.out.println(p.myValue());
	}
}
