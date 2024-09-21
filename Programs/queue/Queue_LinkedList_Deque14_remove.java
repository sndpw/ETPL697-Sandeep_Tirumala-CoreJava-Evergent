package com.evergent.coreJAVA.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

// Remove UserSpecifiedElement
public class Queue_LinkedList_Deque14_remove {
	public static void main(String[] args) {
		// Initialize an ArrayDeque with some elements
		// Deque<Integer> deque1 = new ArrayDeque<>();
		Deque<Integer> deque = new LinkedList<>();
		deque.add(10);
		deque.add(20);
		deque.add(30);
		deque.add(40);
		deque.add(50);

		System.out.println("Original ArrayDeque: " + deque);

		// Create a Scanner object to take user input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the element you want to remove: ");
		int elementToRemove = scanner.nextInt();

		// Remove the specified element
		boolean removed = deque.remove(elementToRemove);

		if (removed) {
			System.out.println("Element " + elementToRemove + " was removed.");
		} else {
			System.out.println("Element " + elementToRemove + " not found in the deque.");
		}

		System.out.println("ArrayDeque after removal: " + deque);

		// Close the scanner
		scanner.close();
	}
}