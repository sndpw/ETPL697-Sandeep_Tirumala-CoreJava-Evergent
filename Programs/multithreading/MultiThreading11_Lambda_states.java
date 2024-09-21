package com.evergent.coreJAVA.multithreading;
/*
   0 New
   1. Runnable
   2. Blocked
   3. Waiting(join)
   4. Waiting(Specific time/sleep)
   5. Terminated
 */
public class MultiThreading11_Lambda_states  {

	public static void main(String[] args) throws InterruptedException {
		Runnable r1=()-> {
			
		      for(int i=0;i<10;i++) {
				//System.out.println("Welcome "+Thread.currentThread().getName()+" -> "+Thread.currentThread().getId());
		}
		};
		
		Runnable r2= ()->{
			
		      for(int i=0;i<20;i++) {
				//System.out.println("MyJava "+Thread.currentThread().getName()+" -> "+Thread.currentThread().getId());
		}
		};
			
		
		Thread t1=new Thread(r1,"RamThread");
		Thread t2=new Thread(r2);
		System.out.println(t1.getState());
		
		t1.start();
		System.out.println(t1.getState());
		Thread.sleep(1000);
		t2.start();
		System.out.println(t1.getState());
		//t1.start(); // thread already dead stage then will get exception : 
		// java.lang.IllegalThreadStateException
		
	}}

