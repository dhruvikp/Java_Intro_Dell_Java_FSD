package com.simplilearn.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<>();
		set.add("Ravi");
		set.add("Dhruvik");
		set.add("Anusha");
		set.add("Akanksha");
		set.add("Sreenivas");
		set.add("Dhruvik");
		//set.add(null);
		
		for(String element: set) {
			System.out.println(element);
		}

	}

}
