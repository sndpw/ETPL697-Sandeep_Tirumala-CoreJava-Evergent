package com.evergent.coreJAVA.interface1;

public class BookImpl1 implements Book {
	public void bookTitle() {
		System.out.println("JAVA");
	}
	public void bookAuthor() {
		System.out.println("James");
	}
	public void bookPrice() {
		System.out.println("Rs. 230");
	}
	public void show() {
		System.out.println("Show is a local method");
	}
	public static void main(String[] args) {
		BookImpl1 b1 = new BookImpl1();
		b1.bookTitle();
		b1.bookAuthor();
		b1.bookPrice();
		b1.show();
	}
}
