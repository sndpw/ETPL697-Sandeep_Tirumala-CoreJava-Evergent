package com.evergent.coreJAVA.multithreading;
//Second way of Thread Creation 
public class MultiThreading9_LambdaFor  {

	public static void main(String[] args) {
		Runnable r1=()-> {
			
		      for(int i=0;i<10;i++) {
				System.out.println("Welcome "+Thread.currentThread().getName()+" -> "+Thread.currentThread().getId());
		}
		};
		
		Runnable r2= ()->{
			
		      for(int i=0;i<20;i++) {
				System.out.println("MyJava "+Thread.currentThread().getName()+" -> "+Thread.currentThread().getId());
		}
		};
			
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
		System.out.println(Thread.activeCount());
	}}

