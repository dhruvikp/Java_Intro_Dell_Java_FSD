package com.simplilearn.constructor;

public class EmpInfo {

	int id;
	String name;
	
	public EmpInfo(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public EmpInfo() {
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		
		EmpInfo ei = new EmpInfo(1, "Drk");
		
		System.out.println(ei.id);
		System.out.println(ei.name);
		
		
		EmpInfo ei2 = new EmpInfo(2, "Anusha");
		System.out.println(ei2.id);
		System.out.println(ei2.name);
	}
}
