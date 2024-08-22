package com.evergent.coreJAVA.strings;

public class SplitDemo2 {

	public static void main(String[] args) {
		String str = "Java is a powerful programming language";
		String[] words = str.split(" ");
		
		for(String word : words) {
			System.out.println(word);
		}
	}
}
