package com.evergent.coreJAVA.multithreading;

public class MultiThreading2 {

	public static void main(String[] args) {
		Thread t1=new Thread();
		t1.start();  
		
		System.out.println(Thread.activeCount()); // 2 two Threads 1 main 2 t1.start
        
	}

}
