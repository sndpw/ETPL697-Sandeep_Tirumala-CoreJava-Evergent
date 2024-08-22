package com.evergent.coreJAVA.GeneralProgramming;

public class BiggestOfFive {

	public static void main(String[] args) {
		int a = 5, b = 10, c = 3, d = 30, e = 20;
		if(a > b && a > c && a > d && a > e) {
			System.out.println("A is Greater");
		} else if(b > a && b > c && b > d && b > e) {
			System.out.println("B is Greater");
		} else if(c > a && c > b && c > d && c > e) {
			System.out.println("C is Greater");
		} else if(d > a && d > c && d > b && d > e) {
			System.out.println("D is Greater");
		} else {
			System.out.println("E is Greater");
		}
	}
}
