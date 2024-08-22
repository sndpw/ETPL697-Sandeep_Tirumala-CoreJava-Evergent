package com.evergent.coreJAVA.abstract1;

public class ProductImpl2 extends Product {
	public void show() {
		System.out.println("Local method");
	}
	public void newProduct() {
		System.out.println("My New Product");
	}
	public static void main(String[] args) {
		Product p1 = new ProductImpl2();
		//p1.show();
		p1.newProduct();
		p1.allProducts();
	}
}