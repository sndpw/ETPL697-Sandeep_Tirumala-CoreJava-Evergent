package com.evergent.coreJAVA.ExceptionHandling;

//14. throws an exception will be executed method by method
public class ExceptionDemo7 {
	String name = null;
	public void myData() throws NullPointerException {
		System.out.println("One");
		System.out.println(name.length());
		System.out.println("End");
	}
	public static void main(String[] args) {
		try {
			ExceptionDemo7 ed2 = new ExceptionDemo7();
			ed2.myData();
		} catch(NullPointerException e) {
			System.out.println(e);
		}
	}
}