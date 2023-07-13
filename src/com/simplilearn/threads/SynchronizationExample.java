package com.simplilearn.threads;

public class SynchronizationExample {

	public static void main(String[] args) {
		Table table = new Table();

		new Thread(new TableRunnable(table, 5)).start();
		new Thread(new TableRunnable(table, 7)).start();
		new Thread(new TableRunnable(table, 9)).start();
		new Thread(new TableRunnable(table, 3)).start();

	}	
}

class Table {
	void printTable(int n) {

		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(n + " * " + i + " = " + n * i);

				try {
					Thread.sleep(100);
				} catch (Exception e) {
					System.out.println(e);
				}
			}

		}
	}
}

class TableRunnable implements Runnable {

	Table table;
	int n;

	TableRunnable(Table table, int n) {
		this.table = table;
		this.n = n;
	}

	@Override
	public void run() {
		this.table.printTable(n);

	}
}
