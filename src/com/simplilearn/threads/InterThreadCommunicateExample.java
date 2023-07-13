package com.simplilearn.threads;

public class InterThreadCommunicateExample {

	public static void main(String[] args) {

		Account account = new Account();
		
		Thread t1 = new Thread(new WithdrawRunnable(account, 1000));
		t1.start();
		
		Thread t2 = new Thread(new DepositRunnable(account, 1000));
		t2.start();
	}

}

class WithdrawRunnable implements Runnable {

	Account account;
	int amount;

	public WithdrawRunnable(Account account, int amount) {
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void run() {
		try {

			this.account.withraw(amount);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

class DepositRunnable implements Runnable {

	Account account;
	int amount;

	public DepositRunnable(Account account, int amount) {
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void run() {
		this.account.deposit(amount);
	}
}

class Account {
	int balance = 0;

	synchronized void withraw(int amount) throws InterruptedException {
		System.out.println("Going to withdraw :" + amount);

		if (this.balance < amount) {
			System.out.println("Insufficient Balance: Waiting for someone to deposit amount");
			wait();
		}

		this.balance -= amount;
		System.out.println("Withdraw completed ... ");
	}

	synchronized void deposit(int amount) {
		System.out.println("Going to deposit :" + amount);
		this.balance += amount;
		System.out.println("Deposit completed ..");
		notify();
	}
}
