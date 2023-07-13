package com.simplilearn.staticex;

public class StaticExample {

	static int a = 5;
	
	public static void test() {
		System.out.println("This is test static example");
	}
	
	public static void main(String[] args) {
		System.out.println(StaticExample.a);
		StaticExample.test();
		
	}

}
