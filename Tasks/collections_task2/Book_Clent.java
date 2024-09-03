package com.evergent.coreJAVA.collections_task2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Book_Clent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookImp book = new BookImp();
		for (;;) {
			System.out.println("1. Add Book 2.Search by isbn 3.displayAll 4. exit");
			int no = sc.nextInt();
			switch (no) {
			case 1:
				Book b = new Book();
				System.out.println("Enter the isbn");
				b.setIsbn(sc.next());
				sc.nextLine();
				System.out.println("Enter the book name");
				b.setBookName(sc.nextLine());
				System.out.println("Enter the price");
				b.setPrice(sc.nextInt());
				System.out.println(book.addBook(b));
				break;
			case 2:
				System.out.println("Enter the isbn");
				String isb = sc.next();
				book.searchByIsbn(isb);
				break;

			case 3:
				book.getAllBooks();
				break;
			case 4:
				System.exit(0);
			}

		}
	}
}
