package com.evergent.coreJAVA.ram.casestudy;

public class AdultUser implements LibraryUser {
	public void registerAccount(int age) throws AgeNotSupportedException {
		if (age > 12)
			System.out.println("You have successfully registered under an Adult Account");
		else
			throw new AgeNotSupportedException("406 - Not Acceptable: Sorry, Age must be greater than 12 to register as an adult");
	}

	public void requestBook(String bookType) throws BookNotSupportedException {
		if (bookType.equals("Fiction"))
			System.out.println("Book Issued successfully, please return the book within 7 days");
		else
			throw new BookNotSupportedException("403 - Forbidden: Oops, you are allowed to take only adult Fiction books");
	}
}
