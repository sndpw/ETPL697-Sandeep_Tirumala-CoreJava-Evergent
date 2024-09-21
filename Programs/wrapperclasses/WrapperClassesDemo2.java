package com.evergent.coreJAVA.wrapperclasses;

public class WrapperClassesDemo2 {

	public static void main(String[] args) {

		int i1 = 100;
		Integer t1 = new Integer(i1);
		int i2 = t1.intValue();
		
		double d1 = 799.89;
		Double d2 = new Double(d1);
		double t2 = d2.doubleValue();
		
		byte b1 = 10;
		Byte b2 = new Byte(b1);
		byte b3 = b2.byteValue();
		
		System.out.println("Int val is :" + i1);
		System.out.println("Object val is :" + t1);
		System.out.println("Object to primitive :" + i2);
		
		System.out.println("double val is :" + d1);
		System.out.println("Object val is :" + d2);
		System.out.println("Object to primitive :" + t2);
		
		System.out.println("byte val is :" + b1);
		System.out.println("Object val is :" + b2);
		System.out.println("Object to primitive :" + b3);
	}
}
