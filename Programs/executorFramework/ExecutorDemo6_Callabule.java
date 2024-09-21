package com.evergent.coreJAVA.executorFramework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
// Submit with Runnable : null 

public class ExecutorDemo6_Callabule {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es=Executors.newFixedThreadPool(5);
		System.out.println(new Date());
		List<Future<String>> futureList =new ArrayList<>();
		for(int i=0;i<=10;i++) {
			futureList.add(es.submit(new MyService4(i)));
		}
		es.shutdown();  // 
		es.awaitTermination(10,TimeUnit.SECONDS);
		System.out.println("-----------------");
		
		for(Future<String>fut:futureList)
			System.out.println(fut.get());
		System.out.println(new Date());
	}}

class MyService4 implements Callable
{
	int i;
	public MyService4(int i) {
		this.i=i;
	}
	
	public Object call() throws Exception {
		Thread.sleep(1000);
		System.out.println("In Thread "+i);
		return "from thread "+i;
		
	}  
		
	}



