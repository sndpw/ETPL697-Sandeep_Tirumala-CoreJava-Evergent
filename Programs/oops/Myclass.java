package com.evergent.coreJAVA.oops;

//Inheriting the Calculation class by using
//extends keyword
public class Myclass extends Calculation {
	//sub class method
	public void show() {
		System.out.println("Local Method");
	}
	public static void main(String[] args) {
		Myclass my = new Myclass();
		my.show();
		my.addition(); //super class(Calculation) method
	}
}
