package com.simplilearn.threads;

public class Multi1 {

	public static void main(String[] args) {
		
		MultiRunnable runnable = new  MultiRunnable();
		
		
		
		Thread t1 = new Thread(runnable);
		t1.start();
		System.out.println("Main thread completed");
	}
}

class MultiRunnable implements Runnable {

	@Override
	public void run() {
		// Seperate execution environment of thread
		// Logic you want to execute while running thread..
		System.out.println("Thread is running");
		int a = 5;
	}
	
}


