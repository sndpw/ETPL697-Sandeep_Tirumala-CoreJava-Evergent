package com.evergent.coreJAVA.strings;

final class ImmutableClass {
	
	private final String name;
	private final int age;
	
	//constructor to initialize the final fields of final class
	ImmutableClass(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String myName() {
		return name;
	}
	
	public int myAge() {
		return age;
	}
}


public class PersonImmutable {
	public static void main(String[] args) {
		ImmutableClass person = new ImmutableClass("Raju", 30);
		System.out.println(person.myName());
		System.out.println(person.myAge());
	}
}


