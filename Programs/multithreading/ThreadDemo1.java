package com.evergent.coreJAVA.multithreading;

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
}

public class ThreadDemo1 {
	public static void main(String args[]) {
		MyThread t1 = new MyThread();
		t1.start();
		t1.setPriority(5);

		MyThread t2 = new MyThread();
		t2.start();
		t2.setPriority(1);
	}
}
