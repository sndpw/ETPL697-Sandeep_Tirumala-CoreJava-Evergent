package com.evergent.coreJAVA.final1;

class MyClass {
	final public void myProducts(){
		System.out.println("My Products");
	}
}

public class FinalDemo2 extends MyClass {
	final String cname = "India"; //final keyword
	
//	public void myProducts(){ //Cannot override the final method from MyClass
//		System.out.println("Hello Products");
//	}
	
	public void myData() {
		System.out.println("My Data");
	}
	
	public static void main(String[] args) {
		FinalDemo2 fd = new FinalDemo2();
		fd.myData();
		fd.myProducts();
		System.out.println(fd.cname);
	}
}
