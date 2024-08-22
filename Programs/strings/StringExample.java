package com.evergent.coreJAVA.strings;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		String str = "JavaProgramming";
		
		char[] ch = str.toCharArray();
		System.out.println(ch.getClass().getSimpleName());
		System.out.println(Arrays.toString(ch).getClass().getSimpleName());
	}

}
