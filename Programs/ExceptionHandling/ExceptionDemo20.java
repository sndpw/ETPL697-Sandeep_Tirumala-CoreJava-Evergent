package com.evergent.coreJAVA.ExceptionHandling;

public class ExceptionDemo20 {
	String name = null;
	int k = 0;
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			try {
				int d = 10/k;
				System.out.println(d);
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			finally {
				System.out.println("inner finally");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("outer finally");
		}
	}
	
	public static void main(String[] args) {
		ExceptionDemo20 ed = new ExceptionDemo20();
		ed.myData();
	}

}