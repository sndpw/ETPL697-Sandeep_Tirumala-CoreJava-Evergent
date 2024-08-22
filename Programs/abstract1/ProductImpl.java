package com.evergent.coreJAVA.abstract1;

public class ProductImpl extends Product {
	public void show() {
		System.out.println("Local method");
	}
	public void newProduct() {
		System.out.println("My New Product");
	}
	public static void main(String[] args) {
		ProductImpl p1 = new ProductImpl();
		p1.show();
		p1.newProduct();
		p1.allProducts();
	}
}