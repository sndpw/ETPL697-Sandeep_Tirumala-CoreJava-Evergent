package com.evergent.coreJAVA.constructors;

public class Student9{
	String name;
	int age;
	
	//constructor
	public Student9(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//copy constructor
	public Student9(Student9 s) {
		this.name = s.name;
		this.age = s.age;
	}
	
	//method to display student details
	public void displayDetails() {
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
	}
	
	public static void main(String[] args) {
		Student9 student1 = new Student9("Bhanu", 20);
		Student9 student2 = new Student9(student1); //creating copy of student1
		student1.displayDetails();
		student2.displayDetails();
	}
}
