package com.evergent.coreJAVA.ExceptionHandling;

class AgeNotSupportedException extends Exception {
	public AgeNotSupportedException(String msg) {
		System.out.println("Hello, " + msg);
	}
}

public class ExceptionDemo10 {

	int age = 17;
	
	public void myAge() throws AgeNotSupportedException {
		if(age < 18) {
			throw new AgeNotSupportedException("you are not eligible to Vote");
		} else {
			System.out.println("You are eligible to Vote!");
		}
	}
	public static void main(String[] args) {
		try {
			ExceptionDemo10 ed = new ExceptionDemo10();
			ed.myAge();
		} catch(Exception e) {
			System.out.println("I can handle " + e);
		}
	}

}
