package com.evergent.java8.streamapi;

import java.io.Serializable;

public class ProductBean implements Serializable{
	
	private int pno;
	private String pname;
	private double price;
	
public ProductBean() {
		
	}
	// Parametrized  Constructor
		public ProductBean(int pno, String pname, double price) {
			super();
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
