package com.simplilearn.strings;

public class StringExample {

	public static void main(String[] args) {
		String s1 = new String("Hello World!");
		System.out.println(s1.length());
		
		// Substring
		String sub = new String("Welcome");
		System.out.println(sub.substring(2,5));
		
		// String comparision
		String s2 =  new String("Hello");
		String s3 = new String("Hello");
		
		System.out.println(s2.compareTo(s3));
		System.out.println(s2.equals(s3));
		System.out.println(s2 == s3);
		System.out.println(s2.isEmpty());
		
		System.out.println(s2.replace("l", "d"));
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" Simplilearn!");
		sb.delete(0, 1);
		sb.reverse();
		System.out.println(sb.toString());
		

		
		
	}

}
