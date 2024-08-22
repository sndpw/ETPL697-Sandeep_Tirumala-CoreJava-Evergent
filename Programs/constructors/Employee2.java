package com.evergent.coreJAVA.constructors;
//Constructors Example
public class Employee2 {
	int eno;
	String ename;
	double sal;
	//default constructor
	Employee2() {
		System.out.println("Default Constructor");
	}
	//parameterized constructor
	Employee2(int eno1, String ename1, double sal1) {
		eno = eno1;
		ename = ename1;
		sal = sal1;
	}
	//method
	public void display() {
		System.out.println("Employee No :" + eno);
		System.out.println("Employee Name :" + ename);
		System.out.println("Employee Salary :" + sal);
	}
	
	public static void main(String[] args) {
		new Employee2();//object creation
		Employee2 emp2 = new Employee2(123, "Raj", 55000);//initialization
		emp2.display();
	}
}
