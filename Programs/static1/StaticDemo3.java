package com.evergent.coreJAVA.static1;

public class StaticDemo3 {
	static String cname = "India";
	String name = "Raj"; //non-static variable
	
	static public void myData() {
		System.out.println("My Data");
	}
	
	public void show(){ //non-static method
		System.out.println("Show Method");
	}
	
	public static void main(String[] args) {
		System.out.println(cname);
		myData();
		//show();  Cannot make a static reference to the non-static method show()
		StaticDemo3 st = new StaticDemo3();
		st.show();
	}
}
