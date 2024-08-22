package com.evergent.coreJAVA.constructors;
//Constructors don't have any return type including void.
//If we declare it as a void, the compiler considers it as a method.

public class Employee4 {
	//This method has a constructor name
	void Employee4() {
		System.out.println("Default Constructor");
	}
	
	public static void main(String[] args) {
		Employee4 emp4 = new Employee4();
		emp4.Employee4();
	}
}
