package com.evergent.coreJAVA.sandeep.FinalProject.bean;

import java.util.Scanner;

import com.evergent.coreJAVA.sandeep.FinalProject.controller.Main;
import com.evergent.coreJAVA.sandeep.FinalProject.service.Discount;

public abstract class Pet implements PetOperations {
	private String breed;
	private double price;
	private int quantity;
	private String area;

	public Pet(String breed, double price) {
		this.breed = breed;
		this.price = price;
	}

	public Pet() {
	}

	public void setDetails(String breed, double price, String area) {
		this.breed = breed;
		this.price = price;
		this.setArea(area);
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
	
	public double finalCostWithDiscount() {
		return Discount.applyDiscount(getTotalCost());
	}

	@Override
	public final void generateInvoice() {
		double totalCost = getTotalCost();
		double totalCostWithTax = Discount.calculateTotalCostWithTax(totalCost);
		double totalCostWithDiscount = Discount.applyDiscount(totalCost);
		System.out.println("=============================================================");
		System.out.println("Area: " + Main.getAreaSelected() + " | " + getBreed() + " - Quantity: " + getQuantity()
				+ ", Cost: RS." + getPrice());
		System.out.println("Total Cost (excluding tax): RS." + totalCost);
		System.out.println("Total Cost (including tax): RS." + totalCostWithTax);
		System.out.println("Total Cost (with discount): RS." + totalCostWithDiscount);
		System.out.println("=============================================================");
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
}
