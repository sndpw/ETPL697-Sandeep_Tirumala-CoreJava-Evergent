package com.evergent.coreJAVA.collections;
import java.util.ArrayList;

class Book {
	String name;
	public Book(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
}
public class CF9_ArrayList_BookObject {
	public static void main(String[] args) {
		Book b1 = new Book("CoreJAVA");
		Book b2 = new Book("Let Us C");
		Book b3 = new Book("Python programming");
		Book b4 = new Book("Java FullStack");
		
		ArrayList myList = new ArrayList();
		myList.add(b1);
		myList.add(b2);
		myList.add(b3);
		myList.add(b4);
		
		System.out.println(myList);
	}
}
