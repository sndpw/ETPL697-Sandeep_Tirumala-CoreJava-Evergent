package com.evergent.coreJAVA.queue;

import java.util.*;

public class Queue_ArrayDeque8 {
	public static void main(String args[]) {
		ArrayDeque<String> ad = new ArrayDeque<String>();
		ad.add("Banana");
		ad.addFirst("Pinapple");
		ad.add("Watermelon");
		ad.addLast("Papaya");
		System.out.println(ad);
		System.out.println(ad.peek());
		System.out.println(ad.peekLast());
		System.out.println(ad.peekFirst());
	}
}