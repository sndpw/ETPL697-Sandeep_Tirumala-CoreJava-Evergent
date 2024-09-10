package com.evergent.java8.datetime;

import java.time.LocalDate;

public class LocalDateDemo1 {

	public static void main(String[] args) {
		 
		LocalDate localDate=LocalDate.now();
		
		System.out.println(localDate);
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getDayOfYear());
		System.out.println(localDate.isLeapYear());
		System.out.println(localDate.getYear());

	}

}
