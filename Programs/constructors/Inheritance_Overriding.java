package com.evergent.coreJAVA.constructors;

class Animal {
	private String name;
	private int age;
	
	//constructor
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//method
	public void displayInfo() {
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
	}
}

class Dog extends Animal {
	String breed;
	public Dog (String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}
	
	//method overriding
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Breed :" + breed);
	}
}

public class Inheritance_Overriding{
	public static void main(String[] args) {
		Dog dog = new Dog("Buddy", 5, "Golden Retriever");
		dog.displayInfo();
	}
}
