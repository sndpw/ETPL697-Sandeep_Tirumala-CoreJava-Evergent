package com.evergent.coreJAVA.ram.casestudy;

public interface LibraryUser {
	public void registerAccount(int age) throws AgeNotSupportedException;
	public void requestBook(String btype) throws BookNotSupportedException;
}
