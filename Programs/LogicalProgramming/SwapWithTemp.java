package com.evergent.coreJAVA.LogicalProgramming;

public class SwapWithTemp {

	public static void main(String[] args) {
		int a = 10, b = 20;
		int temp = a;
		a = b;
		b = temp;
		System.out.print(a + " " + b);
	}
}
