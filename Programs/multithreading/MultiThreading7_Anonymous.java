package com.evergent.coreJAVA.multithreading;
//Second way of Thread Creation 
public class MultiThreading7_Anonymous  {

	public static void main(String[] args) {
		Runnable r1=new Runnable() {
			public void run() {
				System.out.println("Welcome "+Thread.currentThread().getName()+" -> "+Thread.currentThread().getId());
			}
		};
		
		Runnable r2= new Runnable() {
			public void run() {
				System.out.println("Hello "+Thread.currentThread().getName()+" -> "+Thread.currentThread().getId());
			}
		};
		
		
		
		Thread t1=new Thread(r1,"New-ThreadName");
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
		System.out.println(Thread.activeCount());
	}}

