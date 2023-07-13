package com.simplilearn.collections;

import java.util.Stack;

public class VectorExample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("Dhruvik");
		stack.push("Amit");
		stack.push("Prateek");
		stack.push("Robert");
		stack.push("Alex");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
