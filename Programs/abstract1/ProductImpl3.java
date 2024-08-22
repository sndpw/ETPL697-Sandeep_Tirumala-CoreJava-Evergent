package com.evergent.coreJAVA.abstract1;

public class ProductImpl3 extends Product3 {
	public ProductImpl3() {
		System.out.println("ProductImpl3 Constructor");
	}
	public void show() {
		System.out.println("Local method");
	}
	public void newProduct() {
		System.out.println("My New Product");
	}
	public static void main(String[] args) {
		ProductImpl3 p1 = new ProductImpl3();
		p1.newProduct();
		p1.allProducts();
		p1.show();
	}
}