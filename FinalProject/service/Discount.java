package com.evergent.coreJAVA.sandeep.FinalProject.service;

public class Discount {
	private static final double TAX_RATE;
	private static final double DISCOUNT_PERCENTAGE;

	static {
		TAX_RATE = 0.08;
		DISCOUNT_PERCENTAGE = 0.05;
	}

	public static double calculateTotalCostWithTax(double totalCost) {
		return totalCost * (1 + TAX_RATE);
	}

	public static double applyDiscount(double totalCost) {
		return totalCost * (1 - DISCOUNT_PERCENTAGE);
	}
}
