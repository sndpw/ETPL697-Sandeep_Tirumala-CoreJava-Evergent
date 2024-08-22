package com.evergent.coreJAVA.NestedLoops;

public class NLoop4 {

	public static void main(String[] args) {
		int c = 1;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(" " + c);
				c++;
			}
			System.out.println();
		}
		
//		for(int i = 1; i <= 25; i++) {
//			System.out.print(" " + i);
//			if(i % 5 == 0)
//				System.out.println();
//		}
	}
}
