package com.evergent.java8.datetime;

import java.time.LocalDateTime;

public class LocalDateTimeDemo2 {

	public static void main(String[] args) {
		
		LocalDateTime localdateTime=LocalDateTime.now();
		
		System.out.println(localdateTime);
		System.out.println(localdateTime.getDayOfMonth());
		System.out.println(localdateTime.getHour());
		System.out.println(localdateTime.getMinute());
		System.out.println(localdateTime.getNano());
		System.out.println(localdateTime.getDayOfYear());
		System.out.println(localdateTime.getDayOfMonth());

	}

}
