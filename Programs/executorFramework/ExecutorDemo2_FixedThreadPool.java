package com.evergent.coreJAVA.executorFramework;
//executor framework when we start  only ourhand once start not our controll 
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
// asynchronous communicatin 
//public interface ExecutorService extends Executor (from JDK 1.5)
// Executor having one method execute()
public class ExecutorDemo2_FixedThreadPool {
	public static void main(String[] args) throws Exception  {
		                                 //here only sigle thread 
		//ExecutorService exservice=Executors.newSingleThreadExecutor();
		                                      // will take 3 ThreadPool
		ExecutorService exservice=Executors.newFixedThreadPool(3);
		 for(int i=0;i<9;i++) {
			         // execute method has given specific work to 
			 exservice.execute(new Myclass2("Thread"+i));
			 
		 }		 
        exservice.shutdown();
        //System.out.println("All Threads executons completed");
	} 
}
class Myclass2 implements Runnable {

	final String task;
	
	public Myclass2(String task) {
		this.task=task;
	}
	
	@Override
	public void run() {
//		for(int i=0;i<3;i++) {
		try {
			System.out.println("Executing :"+task+"  from "+Thread.currentThread().getName());
			Thread.sleep(1000);
		} catch(Exception e) {
			System.out.println(e);
		}
			
		//}
		
	}
	
}