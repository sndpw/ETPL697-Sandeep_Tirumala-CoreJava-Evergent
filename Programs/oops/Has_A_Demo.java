package com.evergent.coreJAVA.oops;

public class Has_A_Demo {
	public void myData() {
		System.out.println("Has_A_Demo");
	}
	
	public static void main(String[] args) {
		Has_A_Demo has = new Has_A_Demo();
		has.myData();
		Person p = new Person();//object creation
		p.display();
	}

}
