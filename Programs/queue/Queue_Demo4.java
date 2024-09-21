package com.evergent.coreJAVA.queue;

import java.util.Queue;
import java.util.PriorityQueue;


public class Queue_Demo4 {

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();
		
		pq.add(8);
		pq.offer(2);
		pq.add(5);
		pq.add(9);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		System.out.println(pq.peek());
	}

}
