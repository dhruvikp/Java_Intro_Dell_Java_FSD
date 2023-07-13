
public class Animal {
	void eat() {
		System.out.println("Eating..");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		
		BabyDog bd = new BabyDog();
		bd.weep();
		bd.bark();
		bd.eat();
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Barking..");
	}
}

class BabyDog extends Dog {
	void weep() {
		System.out.println("Weeping..");
	}
}
