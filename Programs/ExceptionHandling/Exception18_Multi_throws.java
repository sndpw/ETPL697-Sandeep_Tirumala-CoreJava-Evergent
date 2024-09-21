package com.evergent.coreJAVA.ExceptionHandling;

public class Exception18_Multi_throws {
	String name = null;
	int k = 0;
	
	public void myData() throws NullPointerException, ArithmeticException {
		System.out.println("One");
		System.out.println(name.length());
		int a = 10/k;
		System.out.println("End");
	}
	
	public static void main(String[] args) {
		try {
			Exception18_Multi_throws ed2 = new Exception18_Multi_throws();
			ed2.myData();
		} catch(Exception e) {
			System.out.println("I can handle :" + e);
		}
	}
}
