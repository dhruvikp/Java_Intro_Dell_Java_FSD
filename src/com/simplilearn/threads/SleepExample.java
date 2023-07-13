package com.simplilearn.threads;

public class SleepExample {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new Multi2());
		Thread t2 = new Thread(new Multi2());

		t1.start();
		t1.join();
		
		t2.start();
		
	}
	
}

class Multi2 implements Runnable {

	@Override
	public void run() {
		for (int i=1; i<5; i++) {
			try {
				System.out.println(Thread.currentThread().getName()+ " : "+ i);
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
