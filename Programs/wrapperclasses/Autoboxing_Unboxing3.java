package com.evergent.coreJAVA.wrapperclasses;

public class Autoboxing_Unboxing3 {

	public static void main(String[] args) {
		// AutoBoxing
		int a = 100;
		Integer i1 = new Integer(a);

		// AutoUnboxing
		int i2 = i1.intValue();
		System.out.println("Object val is :" + i1);
		System.out.println("Object to primitive :" + i2);

		// AutoBoxing of char
		char ch = 'a';
		Character myc = new Character(ch);

		// AutoUnboxing of Character
		char ch2 = myc.charValue();
		System.out.println("Object val is :" + ch);
		System.out.println("Object to primitive :" + ch2);
	}
}
