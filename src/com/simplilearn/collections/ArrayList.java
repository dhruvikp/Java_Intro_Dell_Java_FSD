package com.simplilearn.collections;

import java.util.LinkedList;
import java.util.List;

public class ArrayList {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();
		list.add("Krooti");
		list.add("Robert");
		list.add("Krooti");
		list.add("Dhruvik");

//		Iterator<String> itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}

		for (String name : list) {
			System.out.println(name);
		}
	}
}
