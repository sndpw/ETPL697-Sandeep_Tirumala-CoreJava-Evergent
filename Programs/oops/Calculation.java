package com.evergent.coreJAVA.oops;

//Example for Loosely Encapsulated class
//(binding attributes and methods inside a class)
public class Calculation {
	int a = 10, b = 20, c;
	
	public void addition() {
		c = a + b;
		System.out.println(c);
	}
	
	public void subtraction() {
		c = b - a;
		System.out.println(c);
	}
	
	public void multiplication() {
		c = a * b;
		System.out.println(c);
	}
	
	public void division() {
		c = b / a;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Calculation cal = new Calculation();
		cal.addition();
		cal.subtraction();
		cal.multiplication();
		cal.division();
	}
}
