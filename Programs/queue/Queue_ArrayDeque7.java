package com.evergent.coreJAVA.queue;

import java.util.*;

public class Queue_ArrayDeque7 {
	public static void main(String args[]) {
		ArrayDeque<String> ad = new ArrayDeque<String>();
		ad.add("Banana");
		ad.addFirst("Pinapple");
		ad.add("Watermelon");
		ad.addLast("Papaya");
		ad.offerFirst("Kiwi");
		ad.offer("Apple");
		ad.offerLast("Mango");
		System.out.println(ad);
		System.out.println(ad.size());
		boolean b = ad.isEmpty();
		System.out.println(b);
		ad.clear();
		System.out.println(ad);
	}
}