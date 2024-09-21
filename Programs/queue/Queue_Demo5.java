package com.evergent.coreJAVA.queue;
import java.util.*;

public class Queue_Demo5 {
	public static void main(String args[]) {
		Queue<Integer> q = new PriorityQueue<Integer>(Comparator.reverseOrder());
		q.add(8);
		q.add(2);
		q.add(5);
		q.add(9);
		System.out.println(q);
	}
}