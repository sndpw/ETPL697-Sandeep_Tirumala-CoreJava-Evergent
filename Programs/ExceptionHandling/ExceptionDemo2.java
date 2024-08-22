package com.evergent.coreJAVA.ExceptionHandling;

//3. All Exceptions are executed while abnormal conditions only
//4. During normal flow it won't execute any exceptions
//5. Once any exceptions are occurring in java code then remaining lines of code are unreachable
public class ExceptionDemo2 {
	String name = "null";
	
	public void myData() {
		try {
			System.out.println("One");
			System.out.println(name.length());
			System.out.println("End");
		} catch(NullPointerException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		ExceptionDemo2 ed2 = new ExceptionDemo2();
		ed2.myData();
	}
}
