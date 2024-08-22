package com.evergent.coreJAVA.GeneralProgramming;

public class BiggestOfThree {

	public static void main(String[] args) {
		int a = 10, b = 5, c = 20;
		if(a > b && a > c) {
			System.out.println("A is Greater");
		} else if(b > a && b > c) {
			System.out.println("B is Greater");
		} else {
			System.out.println("C is Greater");
		}
	}
}
