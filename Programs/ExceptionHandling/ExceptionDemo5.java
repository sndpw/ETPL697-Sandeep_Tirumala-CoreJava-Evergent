package com.evergent.coreJAVA.ExceptionHandling;

//11. try is for business logic
//12. catch is for handling exceptions
//13. finally block is executed if even exception occurs or not
public class ExceptionDemo5 {
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
		} finally {
			System.out.println("Finally Block");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo5 ed2 = new ExceptionDemo5();
		ed2.myData();
	}
}
