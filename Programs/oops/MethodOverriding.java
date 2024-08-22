package com.evergent.coreJAVA.oops;
//Method Overriding
class MyBigData {
	public void myData() {
		System.out.println("MyBigData: class method");
	}
}

public class MethodOverriding extends MyBigData{
	//overriding the super class method
	public void myData() {
		System.out.println("MyData");
	}
	
	public static void main(String[] args) {
		MethodOverriding mo = new MethodOverriding();
		mo.myData();
	}
}
