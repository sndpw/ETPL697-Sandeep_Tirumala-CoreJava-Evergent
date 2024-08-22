package com.evergent.coreJAVA.ExceptionHandling;

//3. All Exceptions are executed while abnormal conditions only
//4. During normal flow it won't execute any exceptions
//5. Once any exceptions are occurring in java code then remaining lines of code are unreachable
public class ExceptionDemo3 {
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
		}
	}
	public static void main(String[] args) {
		ExceptionDemo3 ed2 = new ExceptionDemo3();
		ed2.myData();
	}
}
