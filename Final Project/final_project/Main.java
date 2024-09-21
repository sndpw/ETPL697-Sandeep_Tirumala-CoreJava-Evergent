package com.evergent.coreJAVA.sandeep.final_project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static String areaSelected;
	private static Pet currentPet;
	private static boolean paymentDone = false;
	protected static double finalPrice = 0;
	static PetDAO pDAO = new PetDAO();

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("\n\t\tWelcome to Online Pet Store");
			System.out.println("==============================================");
			System.out.println("A - Select Area");
			System.out.println("P - Payment Module");
			System.out.println("D - Display Discount Calculation");
			System.out.println("Q - Quit");
			System.out.println("==============================================");
			System.out.print("Enter your choice (A, P, D, Q): ");
			String choice = scanner.nextLine();

			switch (choice.toUpperCase()) {
			case "A":
				selectArea();
				break;
			case "P":
				handlePaymentModule();
				break;
			case "D":
				if (currentPet == null) {
					System.out.println("No pet selected. Please select a pet to get the discount information.");
					break;
				}
				displayDiscountCalculation();
				break;
			case "Q":
				System.out.println("Exiting the Application!");
				scanner.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input! Please enter a valid choice.");
			}
		}
	}

	private static void selectArea() throws Exception {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("==============================================");
			System.out.println("K - KPHB");
			System.out.println("B - Bachupally");
			System.out.println("M - Madhapur");
			System.out.println("back - Back to Main Menu");
			System.out.println("==============================================");
			System.out.print("Enter your choice (K, B, M, back): ");
			String area = scanner.nextLine();

			switch (area) {
			case "K":
				areaSelected = "KPHB";
				selectPetType();
				return;
			case "B":
				areaSelected = "Bachupally";
				selectPetType();
				return;
			case "M":
				areaSelected = "Madhapur";
				selectPetType();
				return;
			case "BACK":
				return;
			default:
				System.out.println("Invalid input! Please enter a valid choice.");
			}
		}
	}

	private static void selectPetType() throws Exception {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("\nSelect Pet Type:");
			System.out.println("dogs - Dogs");
			System.out.println("birds - Birds");
			System.out.println("cats - Cats");
			System.out.println("back - Back to Area Selection");
			System.out.print("Enter your choice (dogs, birds, cats, back): ");
			String choice = scanner.nextLine().toLowerCase();

			switch (choice) {
			case "dogs":
				currentPet = new Dog();
				currentPet.selectBreed(areaSelected);
				pDAO.addPet(currentPet);
				break;
			case "birds":
				currentPet = new Bird();
				currentPet.selectBreed(areaSelected);
				pDAO.addPet(currentPet);
				break;
			case "cats":
				currentPet = new Cat();
				currentPet.selectBreed(areaSelected);
				pDAO.addPet(currentPet);
				break;
			case "back":
				return;
			default:
				System.out.println("Invalid input! Please enter a valid choice.");
			}
			if (currentPet != null) {
				ArrayList lis = pDAO.getDetails();
				for (Object s : lis) {
					System.out.println(s);
				}
				System.out.println("==============================================");
				System.out.println("Total Cost with Discounts Applied: RS." + Discount.applyDiscount(pDAO.finalCost));
				handlePaymentModule();
			}
		}
	}

	private static void handlePaymentModule() throws Exception {
		Scanner scanner = new Scanner(System.in);
		if (currentPet == null) {
			System.out.println("No pet selected. Please select a pet before proceeding to payment.");
			return;
		}

		while (true) {
			System.out.println("\nPayment Module:");
			System.out.println("==============================================");
			System.out.println("pay - Make Payment");
			System.out.println("in - View Invoice");
			System.out.println("back - Go Back to Pet Type Selection");
			System.out.println("q - Quit");
			System.out.print("Enter your choice (pay, in, back, q): ");
			String choice = scanner.nextLine();

			switch (choice) {
			case "pay":
				if (paymentDone) {
					System.out.println("Payment already done.");
					return;
				} else {
					System.out.println("=============================================");
					System.out.println("Payment successful! You have purchased ");
					ArrayList lis = pDAO.getDetails();
					for (Object s : lis) {
						System.out.println(s);
					}
					System.out.println("at " + areaSelected + " pet store.");
					System.out.println("=============================================");
					paymentDone = true;
					break;
				}
			case "in":
				if (paymentDone) {
					System.out.println("\nInvoice:");
					ArrayList lis = pDAO.getDetails();
					for (Object s : lis) {
						System.out.println(s);
					}
					System.out.println("Final Price: " + pDAO.finalCost);
					System.out.println("Discounted Price: " + Discount.applyDiscount(pDAO.finalCost));
				} else {
					System.out.println("Please make Payment to generate the invoice.");
				}
				break;
			case "back":
				return;
			case "q":
				System.exit(0);
			default:
				System.out.println("Invalid input! Please enter a valid choice.");
			}
		}
	}

	private static void displayDiscountCalculation() {
		double discountedPrice = Discount.applyDiscount(pDAO.finalCost);
		System.out.println("Original Price: RS." + pDAO.finalCost);
		System.out.println("Price after Discount: RS." + discountedPrice);
	}
}
