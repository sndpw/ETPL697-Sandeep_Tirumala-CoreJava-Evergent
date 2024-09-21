package com.evergent.coreJAVA.sandeep.FinalProject.service;

import java.util.Scanner;

import com.evergent.coreJAVA.sandeep.FinalProject.bean.Pet;

public class Bird extends Pet {
	private static final double PARROT_PRICE = 500;
	private static final double LOVE_BIRD_PRICE = 2000;
	private static final double COCKATIEL_PRICE = 4500;

//	public Bird(String breed, double price) {
//		super(breed, price);
//	}
//
//	public Bird() {
//	}

	public void selectBreed(String area) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nSelect Bird Breed:");
		System.out.println("PR - Parrot | Price - " + PARROT_PRICE);
		System.out.println("LB - Love Birds | Price - " + LOVE_BIRD_PRICE);
		System.out.println("CT - Cockatiel | Price - " + COCKATIEL_PRICE);
		System.out.println("back - Back to Pet Type Selection");
		System.out.print("Enter your choice (PR, LB, CT, back): ");
		String choice = scanner.nextLine();

		switch (choice) {
		case "PR":
			setDetails("Parrot", PARROT_PRICE, area);
			setQuantity(getQuantityFromUser());
			break;
		case "LB":
			setDetails("Love Birds", LOVE_BIRD_PRICE, area);
			setQuantity(getQuantityFromUser());
			break;
		case "CT":
			setDetails("Cockatiel", COCKATIEL_PRICE, area);
			setQuantity(getQuantityFromUser());
			break;
		case "BACK":
			return;
		default:
			System.out.println("Invalid input! Please enter a valid choice.");
		}
	}
}
