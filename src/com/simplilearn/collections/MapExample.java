package com.simplilearn.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("1", "Dhruvik");
		map.put("2", "Anusha");
		map.put("3", "Sreenivas");
		map.put("6", "Jai");

		Set<String> keys = map.keySet();
		Collection<String> values = map.values();
		
		
		Set entrySet = map.entrySet();
		
		Iterator itr = entrySet.iterator();
		
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey() + " - "+ entry.getValue());
			
		}

	}

}
