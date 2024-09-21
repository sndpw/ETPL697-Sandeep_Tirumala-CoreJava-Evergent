package com.evergent.coreJAVA.queue;

import java.util.*;

public class Queue_ArrayDeque9 {
	public static void main(String args[]) {
		ArrayDeque<String> ad = new ArrayDeque<String>();
		ad.add("Banana");
		ad.addFirst("Pinapple");
		ad.add("Watermelon");
		ad.addLast("Papaya");
		System.out.println(ad);
		System.out.println(ad.poll());
		System.out.println(ad.pollLast());
		System.out.println(ad.pollFirst());
	}
}
