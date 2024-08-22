package com.evergent.coreJAVA.javabeans;

public class ProductImpl2 {

	public static void main(String[] args) {
		ProductBean emp = new ProductBean(101, "Laptop", 60000);

		System.out.println("Employee No :" + emp.getPno());
		System.out.println("Employee Name :" + emp.getPname());
		System.out.println("Employee Salary :" + emp.getPrice());
	}
}
