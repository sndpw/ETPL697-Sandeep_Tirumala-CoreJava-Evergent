package com.evergent.coreJAVA.ram.casestudy;

public class KidUser implements LibraryUser {

	public void registerAccount(int age) throws AgeNotSupportedException {
		if (age < 12)
			System.out.println("You have successfully registered under a Kids Account");
		else
			throw new AgeNotSupportedException("406 - Not Acceptable: Sorry, Age must be less than 12 to register as a kid");
	}

	public void requestBook(String bookType) throws BookNotSupportedException {
		if (bookType.equals("Kids"))
			System.out.println("Book Issued successfully, please return the book within 10 days");
		else
			throw new BookNotSupportedException("403 - Forbidden: Oops, you are allowed to take only kids books");

	}
}
