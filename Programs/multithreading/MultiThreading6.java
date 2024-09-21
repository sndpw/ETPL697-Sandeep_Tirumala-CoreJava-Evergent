package com.evergent.coreJAVA.multithreading;

//Second way of Thread Creation 
public class MultiThreading6 {

	public static void main(String[] args) {
		Employee2 e2 = new Employee2();
		Thread t1 = new Thread(e2);
		t1.start();
//		Thread t3 = new Thread(e2);
//		t3.start();

		Manager2 m2 = new Manager2();
		Thread t2 = new Thread(m2);
		t2.start();
		System.out.println(Thread.activeCount());

	}
}

class Employee2 implements Runnable {
	public void run() {
		System.out.println("Welcome " + Thread.currentThread().getName() + " -> " + Thread.currentThread().getId());
	}
}

class Manager2 implements Runnable {
	public void run() {
		System.out.println("My Manager " + Thread.currentThread().getName() + "->" + Thread.currentThread().getId());
	}
}
