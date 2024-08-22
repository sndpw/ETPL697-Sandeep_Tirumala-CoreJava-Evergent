package com.evergent.coreJAVA.Arrays;

public class TwoDimArrayDemo5 {

	public static void main(String[] args) {
		String arr[][] = new String[5][5];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				arr[i][j] = "JAVA";
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
