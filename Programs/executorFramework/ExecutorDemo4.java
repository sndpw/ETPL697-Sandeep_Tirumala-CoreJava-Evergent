package com.evergent.coreJAVA.executorFramework;

import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class ExecutorDemo4 {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService es=Executors.newFixedThreadPool(5);
		System.out.println(new Date());
		for(int i=0;i<=25;i++) {
			es.execute(new MyService2(i));
		}
		es.shutdown();  // 
		es.awaitTermination(10,TimeUnit.SECONDS);
		System.out.println(new Date());
	}}
class MyService2 implements Runnable
{
	int i;
	public MyService2(int i) {
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



