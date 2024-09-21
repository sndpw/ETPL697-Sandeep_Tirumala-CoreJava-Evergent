package com.evergent.coreJAVA.ExceptionHandling;

public class Exception19_Multi_Catch {
	String name = "null";
	int k = 0;

	public void myData() {
		try {
			System.out.println("One");
			System.out.println(name.length());
			int a = 10 / k;
			System.out.println("End");
		} catch (NullPointerException | ArithmeticException e) {
			System.out.println("I can handle: " + e);
		}
	}

	public static void main(String[] args) {
		Exception19_Multi_Catch ed2 = new Exception19_Multi_Catch();
		ed2.myData();
	}
}
