package com.evergent.coreJAVA.strings;

public class StringDemo1 {

	public static void main(String[] args) {
		String str1 = new String("JAVA");
		String str2 = new String("JAVA");
		
		if(str1 == str2)
			System.out.println("True");
		else
			System.out.println("False");
		
		if(str1.equals(str2))
			System.out.println("True");
		else
			System.out.println("False");
	}
}
