package com.evergent.coreJAVA.sandeep.application2;

import java.util.Scanner;

public class PetShopDomain {

	enum MainMenu {
		A, P, Q
	}

	enum Area {
		K, B, M, back
	}

	enum PetType {
		dogs, birds, cats, back
	}

	enum DogBreed {
		LB, BD, GS, back
	}

	enum CatBreed {
		PC, BC, SC, back
	}

	enum BirdBreed {
		parrot, LB, CT, back
	}

	enum Gender {
		M, F
	}

	enum FinalMenu {
		pay, in, back, h
	}

	static String selectedBreed;
	static Gender selectedGender;
	static int selectedQuantity;
	static double selectedPrice;
	static double totalCost;
	static String areaSelected;
	static boolean flag;

	public static void main(String[] args) {
		displayHomeMenu();
	}

	public static void displayHomeMenu() {
		Scanner scanner = new Scanner(System.in);
		String areaChoice;
		String payChoice;
		while (true) {
			System.out.println("\n\t\tWelcome to Online Pet Store");
			System.out.println("==============================================");
			System.out.println("A - Select Area");
			System.out.println("P - Payment Module");
			System.out.println("Q - Quit");
			System.out.println("==============================================");
			System.out.print("Enter your choice (A, P, Q): ");
			areaChoice = scanner.nextLine().toUpperCase();
			try {
				switch (MainMenu.valueOf(areaChoice)) {
				case A:
					selectArea();
					break;
				case Q:
					System.out.println("Exiting the Application!");
					scanner.close();
					System.exit(0);
					break;
				case P:
					if (selectedBreed == null) {
						System.out.println("There is nothing to show!");
					} else {
						System.out.println("==============================================");
						if (selectedBreed == "birds") {
							System.out.println(
									selectedBreed + " - Quantity: " + selectedQuantity + ", Cost: RS." + selectedPrice);
						} else {
							System.out.println(selectedBreed + " (" + selectedGender + ") - Quantity: "
									+ selectedQuantity + ", Cost: RS." + selectedPrice);
						}
						System.out.println("==============================================");
						System.out.println("Total Cost: RS." + totalCost);
						System.out.println("pay - Make Payment");
						System.out.println("in - View Invoice");
						System.out.println("back - Go Back to Pet Type Selection");
						System.out.println("h - Go Home (Main Menu)");
						System.out.print("Enter your choice (pay, in, back, h): ");
						payChoice = scanner.nextLine();
						while (true) {
							try {
								switch (FinalMenu.valueOf(payChoice)) {
								case pay:
									if (!flag) {
										System.out.println("Payment successful! You have purchased " + selectedQuantity
												+ " " + selectedBreed + "(s) at " + areaSelected + " pet store .");
										flag = true;
									} else {
										System.out.println("Payment Is Already Done!");
									}
									return;
								case in:
									if (flag) {
										generateInvoice();
									} else {
										System.out.println("Please make Payment to generate the invoice");
									}
									return;
								case back:
									return;
								case h:
									displayHomeMenu();
									break;
								}
							} catch (IllegalArgumentException e) {
								System.out.println("Invalid input! Please enter a valid choice.");
							}
						}
					}
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid input! Please enter a valid choice.");
			}
		}
	}

	private static void selectArea() {
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
			try {
				switch (Area.valueOf(area)) {
				case K:
					areaSelected = "KPHB";
					selectPetType(area);
					break;
				case B:
					areaSelected = "Bachupally";
					selectPetType(area);
					break;
				case M:
					areaSelected = "Madhapur";
					selectPetType(area);
					break;
				case back:
					return;
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid input! Please enter a valid choice.");
			}
		}
	}

	private static void selectPetType(String area) {
		Scanner scanner = new Scanner(System.in);
		String choice;
		while (true) {
			System.out.println("\nSelect Pet Type:");
			System.out.println("dogs - Dogs");
			System.out.println("birds - Birds");
			System.out.println("cats - Cats");
			System.out.println("back - Back to Area Selection");
			System.out.print("Enter your choice (dogs, birds, cats, back): ");
			choice = scanner.nextLine();
			try {
				switch (PetType.valueOf(choice)) {
				case dogs:
					selectDogBreed(area);
					break;
				case birds:
					selectBirdBreed(area);
				case cats:
					selectCatBreed(area);
					break;
				case back:
					return;
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid input! Please enter a valid choice.");
			}
		}
	}

	private static void selectDogBreed(String area) {
		Scanner scanner = new Scanner(System.in);
		String choice;
		while (true) {
			System.out.println("\nSelect Dog Breed:");
			System.out.println("LB - Labrador | Price - 2500");
			System.out.println("BD - Bulldog | Price - 3600");
			System.out.println("GS - German Shepherd | Price - 2550");
			System.out.println("back - Back to Pet Type Selection");
			System.out.print("Enter your choice (LB, BD, GS, back): ");
			choice = scanner.nextLine();
			try {
				switch (DogBreed.valueOf(choice)) {
				case LB:
					setDogDetails("Labrador", 2500, area);
					break;
				case BD:
					setDogDetails("Bulldog", 3600, area);
					break;
				case GS:
					setDogDetails("German Shepherd", 2550, area);
					break;
				case back:
					return;
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid input! Please enter a valid choice.");
			}
		}
	}

	private static void selectCatBreed(String area) {
		Scanner scanner = new Scanner(System.in);
		String choice;
		while (true) {
			System.out.println("\nSelect Cat Breed:");
			System.out.println("PC - Persian Cat | Price - 7000");
			System.out.println("BC - Bombay Cat | Price - 4600");
			System.out.println("SC - Siamese cat | Price - 10000");
			System.out.println("back - Back to Pet Type Selection");
			System.out.print("Enter your choice (PC, BC, SC, back): ");
			choice = scanner.nextLine();
			try {
				switch (CatBreed.valueOf(choice)) {
				case PC:
					setCatDetails("Persian Cat", 7000, area);
					break;
				case BC:
					setCatDetails("Bombay Cat", 4600, area);
					break;
				case SC:
					setCatDetails("Siamese Cat", 10000, area);
					break;
				case back:
					return;
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid input! Please enter a valid choice.");
			}
		}
	}

	private static void selectBirdBreed(String area) {
		Scanner scanner = new Scanner(System.in);
		String choice;
		while (true) {
			System.out.println("\nSelect Bird Breed:");
			System.out.println("parrot - Parrot | Price - 500");
			System.out.println("LB - Love Birds | Price - 2000");
			System.out.println("CT - Cockatiel | Price - 4500");
			System.out.println("back - Back to Pet Type Selection");
			System.out.print("Enter your choice (parrot, LB, CT, back): ");
			choice = scanner.nextLine();
			try {
				switch (BirdBreed.valueOf(choice)) {
				case parrot:
					setBirdDetails("Parrot", 500, area);
					break;
				case LB:
					setBirdDetails("Love Birds", 2000, area);
					break;
				case CT:
					setBirdDetails("Cockatiel", 4500, area);
					break;
				case back:
					return;
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid input! Please enter a valid choice.");
			}
		}
	}

	private static void setDogDetails(String breed, double price, String area) {
		Scanner scanner = new Scanner(System.in);
		selectedBreed = breed;
		selectedPrice = price;
		System.out.println("\nSelect Gender:");
		System.out.println("M - Male");
		System.out.println("F - Female");
		System.out.print("Enter your choice (M, F): ");
		selectedGender = Gender.valueOf(scanner.nextLine());
		System.out.print("Enter the no.of puppies you want to buy: ");
		selectedQuantity = Integer.parseInt(scanner.nextLine());
		totalCost = selectedPrice * selectedQuantity;
		System.out.println(selectedBreed + " (" + selectedGender + ") - Quantity: " + selectedQuantity + ", Cost: RS."
				+ selectedPrice);
		System.out.println("==============================================");
		System.out.println("Total Cost: RS." + totalCost);
		String finalChoice;
		while (true) {
			System.out.println("\nFinal Menu:");
			System.out.println("pay - Make Payment");
			System.out.println("in - View Invoice");
			System.out.println("back - Go Back to Pet Type Selection");
			System.out.println("h - Go Home (Main Menu)");
			System.out.print("Enter your choice (pay, in, back, h): ");
			finalChoice = scanner.nextLine();
			try {
				switch (FinalMenu.valueOf(finalChoice)) {
				case pay:
					if (!flag) {
						System.out.println("Payment successful! You have purchased " + selectedQuantity + " "
								+ selectedBreed + "(s) at " + areaSelected + " pet store .");
						flag = true;
					} else {
						System.out.println("Payment Is Already Done!");
					}
					break;
				case in:
					if (flag) {
						generateInvoice();
					} else {
						System.out.println("Please make Payment to generate the invoice");
					}
					break;
				case back:
					return;
				case h:
					displayHomeMenu();
					break;
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid input! Please enter a valid choice.");
			}
		}
	}

	private static void setCatDetails(String breed, double price, String area) {
		Scanner scanner = new Scanner(System.in);
		selectedBreed = breed;
		selectedPrice = price;
		System.out.println("\nSelect Gender:");
		System.out.println("M - Male");
		System.out.println("F - Female");
		System.out.print("Enter your choice (M, F): ");
		selectedGender = Gender.valueOf(scanner.nextLine());
		System.out.print("Enter the no.of cats you want to buy: ");
		selectedQuantity = Integer.parseInt(scanner.nextLine());
		totalCost = selectedPrice * selectedQuantity;
		System.out.println(selectedBreed + " (" + selectedGender + ") - Quantity: " + selectedQuantity + ", Cost: RS."
				+ selectedPrice);
		System.out.println("==============================================");
		System.out.println("Total Cost: RS." + totalCost);
		String finalChoice;
		while (true) {
			System.out.println("\nFinal Menu:");
			System.out.println("pay - Make Payment");
			System.out.println("in - View Invoice");
			System.out.println("back - Go Back to Pet Type Selection");
			System.out.println("h - Go Home (Main Menu)");
			System.out.print("Enter your choice (pay, in, back, h): ");
			finalChoice = scanner.nextLine();
			try {
				switch (FinalMenu.valueOf(finalChoice)) {
				case pay:
					if (!flag) {
						System.out.println("Payment successful! You have purchased " + selectedQuantity + " "
								+ selectedBreed + "(s) at " + areaSelected + " pet store .");
						flag = true;
					} else {
						System.out.println("Payment Is Already Done!");
					}
					break;
				case in:
					if (flag) {
						generateInvoice();
					} else {
						System.out.println("Please make Payment to generate the invoice");
					}
					break;
				case back:
					return;
				case h:
					displayHomeMenu();
					break;
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid input! Please enter a valid choice.");
			}
		}
	}

	private static void setBirdDetails(String breed, double price, String area) {
		Scanner scanner = new Scanner(System.in);
		selectedBreed = breed;
		selectedPrice = price;
		System.out.print("Enter the no.of birds you want to buy: ");
		selectedQuantity = Integer.parseInt(scanner.nextLine());
		totalCost = selectedPrice * selectedQuantity;
		System.out.println(selectedBreed + " - Quantity: " + selectedQuantity + ", Cost: RS." + selectedPrice);
		System.out.println("==============================================");
		System.out.println("Total Cost: RS." + totalCost);
		String finalChoice;
		while (true) {
			System.out.println("\nFinal Menu:");
			System.out.println("pay - Make Payment");
			System.out.println("in - View Invoice");
			System.out.println("back - Go Back to Pet Type Selection");
			System.out.println("h - Go Home (Main Menu)");
			System.out.print("Enter your choice (pay, in, back, h): ");
			finalChoice = scanner.nextLine();
			try {
				switch (FinalMenu.valueOf(finalChoice)) {
				case pay:
					if (!flag) {
						System.out.println("Payment successful! You have purchased " + selectedQuantity + " "
								+ selectedBreed + "(s) at " + areaSelected + " pet store .");
						flag = true;
					} else {
						System.out.println("Payment Is Already Done!");
					}
					break;
				case in:
					if (flag) {
						generateInvoice();
					} else {
						System.out.println("Please make Payment to generate the invoice");
					}
					break;
				case back:
					return;
				case h:
					displayHomeMenu();
					break;
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid input! Please enter a valid choice.");
			}
		}
	}

	private static void generateInvoice() {
		System.out.println("\nInvoice:");
		System.out.println("=============================================================");
		System.out.println("Area :" + areaSelected + "| " + selectedBreed + " (" + selectedGender + ") - Quantity: "
				+ selectedQuantity + ", Cost: RS." + selectedPrice);
		System.out.println("=============================================================");
		System.out.println("Total Cost: RS." + totalCost);
	}
}
