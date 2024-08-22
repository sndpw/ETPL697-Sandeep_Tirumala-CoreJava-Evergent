package com.evergent.coreJAVA.strings;

public class RemoveSpaces {

	public static void main(String[] args) {
		String str = "Hello World!";
		
		String noSpaces = str.replace(" ", "");
		System.out.println(noSpaces);
	}
}
