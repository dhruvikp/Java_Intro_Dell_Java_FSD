
public class AbstractionExmple {

	public static void main(String[] args) {
		
		
		
		Vehicle1 vehicle = new Baleno();
		vehicle.drive();
		vehicle.horn();
	}

}

// Enforce your child class to implement bahavior
abstract class Vehicle1 {
	
	void horn() {
		System.out.println("Horning..");
	}
	
	abstract void drive() ;
}

class Baleno extends Vehicle1 {
	void drive() {
		System.out.println("Drive using baleno");
	}
}
