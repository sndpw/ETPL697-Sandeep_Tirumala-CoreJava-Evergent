package com.evergent.coreJAVA.final1;

//final classes can't be inherited

final class MyClass1 {
	final public void myProducts(){
		System.out.println("My Products");
	}
}

public class FinalDemo3 {
	final String cname = "India"; //final keyword
	
	public void myData() {
		System.out.println("My Data");
	}
	
	public static void main(String[] args) {
		MyClass1 my = new MyClass1();
		FinalDemo3 fd = new FinalDemo3();
		fd.myData();
		my.myProducts();
		System.out.println(fd.cname);
	}
}
