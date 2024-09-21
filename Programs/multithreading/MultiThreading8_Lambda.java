package com.evergent.coreJAVA.multithreading;
//Second way of Thread Creation 
public class MultiThreading8_Lambda  {

	public static void main(String[] args) {
		Runnable r1=()-> 			
				System.out.println("Welcome "+Thread.currentThread().getName()+" -> "+Thread.currentThread().getId());
			
		
		
		Runnable r2= ()->			
				System.out.println("Hello "+Thread.currentThread().getName()+" -> "+Thread.currentThread().getId());
			
			
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
		System.out.println(Thread.activeCount());
	}}

