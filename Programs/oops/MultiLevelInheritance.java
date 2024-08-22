package com.evergent.coreJAVA.oops;

//Java will support multilevel inheritance through classes.

class MyPerson {
	public void personInfo() {
		System.out.println("Raj");
	}
}

class personDetails extends MyPerson {
	public void personData() {
		System.out.println("Hyderabad");
	}
}

public class MultiLevelInheritance extends personDetails{
	public void show() {
		System.out.println("Local Method");
	}
	public static void main(String[] args) {
		MultiLevelInheritance mi = new MultiLevelInheritance();
		mi.personInfo(); //super class method
		mi.personData(); //super class method
		mi.show(); //subclass method
	}
}

