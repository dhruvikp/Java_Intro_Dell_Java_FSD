package com.simplilearn.constructor;

public class VehicleExample {

	public static void main(String[] args) {
		Pulsar p = new Pulsar();
		
		p.pulsarDrive();
		
		
	}
}



class Vehicle {

	int a;
	
	public Vehicle(String horn) {
		super();
		System.out.println("Vehicle is created");
	}
	
	void drive() {
		int a = 4;
	}
	
	
}

class Pulsar extends Vehicle {
	public Pulsar() {
		super("");
		System.out.println("Pulsar is created");
	}
	
	void pulsarDrive( ) {
		drive();
	}
}


