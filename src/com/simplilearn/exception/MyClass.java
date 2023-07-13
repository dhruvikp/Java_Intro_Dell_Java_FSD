package com.simplilearn.exception;

import java.io.FileNotFoundException;

class C {
	void c() throws FileNotFoundException {
		throw new FileNotFoundException();
	}
}

class B {
	void b() throws FileNotFoundException {
		C c = new C();
		c.c();
	}
}

class A {
	void a() throws FileNotFoundException {
		B b = new B();
		b.b();
	}
}

class InvalidAgeException extends Exception {

	public InvalidAgeException(String message) {
		super(message);
	}
}	

public class MyClass extends A implements test, test2 {

	public static void main(String[] args) throws InvalidAgeException {

		int age = 9;

		if (age < 18) {
			throw new InvalidAgeException("Age should be greater than 18");
		}
	}

}

interface test {

}

interface test2 {

}
