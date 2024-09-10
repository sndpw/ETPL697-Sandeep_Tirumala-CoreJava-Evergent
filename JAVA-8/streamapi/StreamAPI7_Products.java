package com.evergent.java8.streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI7_Products {

	public static void main(String[] args) {
		     
		List<ProductBean> myProducts=new ArrayList<ProductBean>();
		
		myProducts.add(new ProductBean(10,"MacAIR",180000));
		myProducts.add(new ProductBean(20,"MacProM1",240000));
		myProducts.add(new ProductBean(30,"HPLaptop",65000));
		myProducts.add(new ProductBean(40,"MacAIR",63000));
		
	myProducts.stream().filter(product->product.getPrice()==240000).forEach(product->System.out.println(product.getPname()));
		
	}

}
