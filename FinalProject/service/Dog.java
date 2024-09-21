package com.evergent.coreJAVA.sandeep.FinalProject.service;

import java.util.Scanner;

import com.evergent.coreJAVA.sandeep.FinalProject.bean.Pet;

public class Dog extends Pet {
	private static final double LABRADOR_PRICE = 2500;
	private static final double BULLDOG_PRICE = 3600;
	private static final double GERMAN_SHEPHERD_PRICE = 2550;

	@Override
	public void selectBreed(String area) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nSelect Dog Breed:");
		System.out.println("LB - Labrador | Price - " + LABRADOR_PRICE);
		System.out.println("BD - Bulldog | Price - " + BULLDOG_PRICE);
		System.out.println("GS - German Shepherd | Price - " + GERMAN_SHEPHERD_PRICE);
		System.out.println("back - Back to Pet Type Selection");
		System.out.print("Enter your choice (LB, BD, GS, back): ");
		String choice = scanner.nextLine();

		switch (choice) {
		case "LB":
			setDetails("Labrador", LABRADOR_PRICE, area);
			setQuantity(getQuantityFromUser());
			break;
		case "BD":
			setDetails("Bulldog", BULLDOG_PRICE, area);
			setQuantity(getQuantityFromUser());
			break;
		case "GS":
			setDetails("German Shepherd", GERMAN_SHEPHERD_PRICE, area);
			setQuantity(getQuantityFromUser());
			break;
		case "BACK":
			return;
		default:
			System.out.println("Invalid input! Please enter a valid choice.");
		}
	}
}
