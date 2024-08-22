package com.evergent.coreJAVA.sandeep.application4;

import java.util.Scanner;

public abstract class Pet implements PetOperations {
	private String breed;
	private double price;
	private int quantity;
	protected String area;

	public Pet(String breed, double price) {
		this.breed = breed;
		this.price = price;
	}

	public Pet() {
	}

	public void setDetails(String breed, double price, String area) {
		this.breed = breed;
		this.price = price;
		this.area = area;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBreed() {
		return breed;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getTotalCost() {
		return price * quantity;
	}

	protected int getQuantityFromUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of " + breed + "s you want to buy: ");
		return Integer.parseInt(scanner.nextLine());
	}

	@Override
	public final void generateInvoice() {
		double totalCost = getTotalCost();
		double totalCostWithTax = Discount.calculateTotalCostWithTax(totalCost);
		double totalCostWithDiscount = Discount.applyDiscount(totalCost);
		System.out.println("\nInvoice:");
		System.out.println("=============================================================");
		System.out.println("Area: " + Main.areaSelected + " | " + getBreed() + " - Quantity: " + getQuantity()
				+ ", Cost: RS." + getPrice());
		System.out.println("Total Cost (excluding tax): RS." + totalCost);
		System.out.println("Total Cost (including tax): RS." + totalCostWithTax);
		System.out.println("Total Cost (with discount): RS." + totalCostWithDiscount);
		System.out.println("=============================================================");
	}
}
