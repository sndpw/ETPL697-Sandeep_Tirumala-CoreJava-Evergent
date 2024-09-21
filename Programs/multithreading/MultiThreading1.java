package com.evergent.coreJAVA.multithreading;

public class MultiThreading1 {

	public static void main(String[] args) {
		System.out.println("Hello JAVA");
		// bydefault thread name is called main
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getName());
		
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());

	}

}
