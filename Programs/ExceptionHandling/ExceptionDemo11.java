package com.evergent.coreJAVA.ExceptionHandling;
// user-defined exception InsufficientFundsException.
class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String message) {
		super(message);
	}
}
public class ExceptionDemo11 {
	public static void withdraw(double amount) throws Exception{
		double balance = 500.00;
		if(amount>balance) {
			throw new InsufficientFundsException("Insufficient funds for withdrawal");
		}
		else {
			System.out.println("withdrawal successfull");
		}
	}
	public static void main(String[] args) {
		try {
			withdraw(600.00);
		}
		catch(Exception e) {
			System.out.println("caught Exception: "+e.getMessage());
			System.out.println(e);
		}
	}
}