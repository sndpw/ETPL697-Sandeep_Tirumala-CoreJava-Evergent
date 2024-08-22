package com.evergent.coreJAVA.ExceptionHandling;

//17. We should follow exceptions hierarchy
public class ExceptionDemo4 {
	String name = "null";
	int k = 2;
	public void myData() {
		try {
			System.out.println("One");
			System.out.println(name.length());
			int t = 10  / k;
			System.out.println("End");
		} catch(NullPointerException e) {
			System.out.println(e);
		} catch(ArithmeticException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println("I can handle :" + e);
		}
	}
	public static void main(String[] args) {
		ExceptionDemo4 ed2 = new ExceptionDemo4();
		ed2.myData();
	}
}
