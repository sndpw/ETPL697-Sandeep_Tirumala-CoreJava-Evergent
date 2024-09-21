package com.evergent.coreJAVA.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo4 {

	public static void main(String[] args) {
		TreeMap<Integer, String> studentRecords = new TreeMap<>();

		studentRecords.put(100, "Ramesh");
		studentRecords.put(200, "Bhanu");
		studentRecords.put(300, "Abbas");
		System.out.println(studentRecords);

		for (Map.Entry<Integer, String> entry : studentRecords.entrySet()) {
			System.out.println("Id: " + entry.getKey() + ", Name: " + entry.getValue());
		}

	}

}
