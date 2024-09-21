package com.evergent.coreJAVA.queue;

import java.util.*;

public class Queue_LinkedListDeque10 {
	public static void main(String args[]) {
		Deque<String> dq = new LinkedList<String>();
		dq.add("Ravi");
		dq.offer("Bhanu");
		dq.add("Shnakar");
		dq.add("Chandu");
		System.out.println(dq);
		System.out.println(dq.poll());
	}
}