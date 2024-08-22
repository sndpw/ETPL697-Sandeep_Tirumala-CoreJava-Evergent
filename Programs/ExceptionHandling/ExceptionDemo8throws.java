package com.evergent.coreJAVA.ExceptionHandling;

public class ExceptionDemo8throws {
	String name = null;
	
	public void myData() throws NullPointerException {
		System.out.println("One");
		System.out.println(name.length());
		System.out.println("End");
	}
	
	public void myInfo() throws NullPointerException {
		myData();
		System.out.println("My Info Methods");
	}
	
	public static void main(String[] args) {
		try {
			ExceptionDemo8throws ed2 = new ExceptionDemo8throws();
			ed2.myInfo();
		} catch(Exception e) {
			System.out.println("I can handle :" + e);
		}
	}
}
