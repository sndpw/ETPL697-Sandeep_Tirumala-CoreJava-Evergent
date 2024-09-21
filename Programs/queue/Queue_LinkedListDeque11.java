package com.evergent.coreJAVA.queue;

import java.util.*;

public class Queue_LinkedListDeque11 {
	public static void main(String args[]) {
		Deque<String> dq = new LinkedList<String>();
		dq.add("Banana");
		dq.addFirst("Pinapple");
		dq.add("Watermelon");
		dq.addLast("Papaya");
		dq.offerFirst("Kiwi");
		dq.offer("Apple");
		dq.offerLast("Mango");
		System.out.println(dq);
		System.out.println(dq.size());
		boolean b = dq.isEmpty();
		System.out.println(b);
		dq.clear();
		System.out.println(dq);
	}
}
