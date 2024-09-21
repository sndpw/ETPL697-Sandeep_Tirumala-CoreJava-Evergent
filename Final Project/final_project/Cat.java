package com.evergent.coreJAVA.sandeep.final_project;

import java.util.Scanner;

public class Cat extends Pet {
	private static final double PERSIAN_CAT_PRICE = 7000;
	private static final double BOMBAY_CAT_PRICE = 4600;
	private static final double SIAMESE_CAT_PRICE = 10000;

	@Override
	public void selectBreed(String area) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nSelect Cat Breed:");
		System.out.println("PC - Persian Cat | Price - " + PERSIAN_CAT_PRICE);
		System.out.println("BC - Bombay Cat | Price - " + BOMBAY_CAT_PRICE);
		System.out.println("SC - Siamese Cat | Price - " + SIAMESE_CAT_PRICE);
		System.out.println("back - Back to Pet Type Selection");
		System.out.print("Enter your choice (PC, BC, SC, back): ");
		String choice = scanner.nextLine();

		switch (choice) {
		case "PC":
			setDetails("Persian Cat", PERSIAN_CAT_PRICE, area);
			setQuantity(getQuantityFromUser());
			break;
		case "BC":
			setDetails("Bombay Cat", BOMBAY_CAT_PRICE, area);
			setQuantity(getQuantityFromUser());
			break;
		case "SC":
			setDetails("Siamese Cat", SIAMESE_CAT_PRICE, area);
			setQuantity(getQuantityFromUser());
			break;
		case "back":
			return;
		default:
			System.out.println("Invalid input! Please enter a valid choice.");
		}
	}
}
