package com.evergent.coreJAVA.javabeans;

import java.io.Serializable;

public class ProductBean implements Serializable {
	private int pno;
	private String pname;
	private double price;
	
	public ProductBean(int pno, String pname, double price) {
		this.pno = pno;
		this.pname = pname;
		this.price = price;
	}
	
	public int getPno() {
		return pno;
	}

	public String getPname() {
		return pname;
	}

	public double getPrice() {
		return price;
	}
}
