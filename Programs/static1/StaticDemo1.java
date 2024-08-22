package com.evergent.coreJAVA.static1;

class MyClass {
	static String cname = "Hyd";
}

public class StaticDemo1 {
	static String cname = "India";
	
	static public void myData() {
		System.out.println("My Data");
	}
	
	public static void main(String[] args) {
		System.out.println(cname);
		System.out.println(MyClass.cname);
		myData();
	}

}
