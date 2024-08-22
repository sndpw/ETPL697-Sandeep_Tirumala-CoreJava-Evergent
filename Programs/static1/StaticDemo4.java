package com.evergent.coreJAVA.static1;

public class StaticDemo4 {
	static String cname = "India";
	String name = "Raj"; //non-static variable
	
	static public void myData() {
		System.out.println("My Data");
	}
	
	public void show(){ //non-static method
		myData(); //static method
		System.out.println("From non-static method - " + cname); //static variable
	}
	
	public static void main(String[] args) {
		myData();
		System.out.println(cname);
		StaticDemo4 st = new StaticDemo4();
		st.show();
	}
}
