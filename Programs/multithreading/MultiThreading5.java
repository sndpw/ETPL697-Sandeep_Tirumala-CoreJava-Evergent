package com.evergent.coreJAVA.multithreading;

public class MultiThreading5 {

	public static void main(String[] args) {
		Employee1 t1=new Employee1();
		t1.start();
		
		Manager t2=new Manager();
		t2.start();
		System.out.println(Thread.activeCount()); // 2 two Threads 1 main 2 t1.start
        
	}}



class Employee1 extends Thread{
	public void run() {
		System.out.println("Welcome "+Thread.currentThread().getName()+" -> "+Thread.currentThread().getId());
	}
}
class Manager extends Thread{
	public void run() {
		System.out.println("My Manager "+Thread.currentThread().getName()+"->"+Thread.currentThread().getId());
	}
}
