package com.evergent.coreJAVA.executorFramework;
//"computation" refers to the process of information processing, where data is manipulated
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
// Submit with Runnable : null 
public class ExecutorDemo5_Future {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es=Executors.newFixedThreadPool(5);
		System.out.println(new Date());
		List<Future<String>> futureList =new ArrayList<>();
		for(int i=0;i<=10;i++) {
			futureList.add((Future<String>)es.submit(new MyService3(i)));
		}
		es.shutdown();  // 
		es.awaitTermination(10,TimeUnit.SECONDS);
		System.out.println("-----------------");
		// Runnable returing any thing . It returning Null(print null only : run is returning null)
		for(Future<String>fut:futureList)
			System.out.println(fut.get());
		System.out.println(new Date());
	}}
class MyService3 implements Runnable
{	int i;
	public MyService3(int i) {
		this.i=i;
	}	 
	public void run() {
		 System.out.println("Thread .."+i);
		 try {
			 Thread.sleep(1000);
		 }
		 catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}


