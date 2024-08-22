package com.evergent.coreJAVA.oops;

public class MethodsFlow {
	
	//No parameters with no return type
	public void show() {
		System.out.println("No parameters with no return type");
	}
	
	//parameters with no return type
	public void myData(int a, int b) {
		System.out.println(a + b);
	}
	
	//parameters with return type
	public int myMul(int a, int b) {
		return a * b;
	}
	
	//No parameters with return type
	public int myChange() {
		return 55;
	}
	
	public static void main(String[] args) {
		MethodsFlow mf = new MethodsFlow();
		mf.show();
		mf.myData(20, 40);
		int m = mf.myMul(6, 6);
		System.out.println(m);
		int val = mf.myChange();
		System.out.println(val);
	}
}
