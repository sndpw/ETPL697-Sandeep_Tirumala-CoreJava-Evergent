package com.evergent.coreJAVA.strings;

public class ContainsSubstring {

	public static void main(String[] args) {
		String str = "The quick brown fox";
		String substr = "fox";
		
		boolean contains = str.contains(substr);
		System.out.println(contains);
	}
}
