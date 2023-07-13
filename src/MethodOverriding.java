
public class MethodOverriding {

	public static void main(String[] args) {

		Bank b = new Bank();
		System.out.println(b.getRateOfInterest());

	}

}

class Bank {
	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}











class Vehicle {
	void run() {
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle {
	void run() {
		System.out.println("Bike is running");
	}
}
