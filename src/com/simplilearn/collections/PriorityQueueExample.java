package com.simplilearn.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Amit sharma");
		pq.add("Sreenivas sanikommu");
		pq.add("Anusha Simplilearn");
		pq.add("Raj");
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.remove());
	}

}
