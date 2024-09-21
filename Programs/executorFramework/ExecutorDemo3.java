package com.evergent.coreJAVA.executorFramework;

import java.util.Date;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo3 {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(5);
		System.out.println(new Date());
		for(int i=0;i<=55;i++) {
			es.execute(new MyService1(i));
		}
		es.shutdown(); // It wont wait ...
		System.out.println(new Date());
	} 
}
class MyService1 implements Runnable
{
	int i;
	public MyService1(int i) {
		this.i=i;
	}	 
	public void run() {
		 System.out.println(i+ " "+Thread.currentThread().getName());
		 try {
			 Thread.sleep(1000);
		 }
		 catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
