package com.evergent.coreJAVA.Arrays;

public class TwoDimArrayDemo3 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == j || i + j == 4)
					arr[i][j] = 7;
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
	}
}
