package com.evergent.coreJAVA.ExceptionHandling;

class PetNotSelectedException extends RuntimeException {
	public PetNotSelectedException(String message) {
		super(message);
	}
}

class PaymentAlreadyDoneException extends RuntimeException {
	public PaymentAlreadyDoneException(String message) {
		super(message);
	}
}

public class UserDefined_Exception {

	private static boolean petSelected = true;
	private static boolean paymentDone = false;

	public static void selectPet() {
		if (!petSelected) {
			throw new PetNotSelectedException("No pet has been selected yet.");
		}
		System.out.println("Pet selected successfully.");
	}

	public static void makePayment() {
		if (!petSelected) {
			throw new PetNotSelectedException("Cannot proceed with payment as no pet is selected.");
		}
		if (paymentDone) {
			throw new PaymentAlreadyDoneException("Payment has already been done.");
		}
		paymentDone = true;
		System.out.println("Payment processed successfully.");
	}

	public static void main(String[] args) {
		try {
			selectPet();
			makePayment();
			makePayment();
		} catch (PetNotSelectedException | PaymentAlreadyDoneException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}

}
