package com.evergent.coreJAVA.queue;

import java.util.*;

public class Queue_ArrayDeque6 {
	public static void main(String args[]) {
		ArrayDeque<String> ad = new ArrayDeque<String>();
		ad.add("Ravi");
		ad.add("Bhanu");
		ad.add("Shankar");
		ad.add("Chandu");
		System.out.println(ad);
		System.out.println(ad.peek());
	}
}
