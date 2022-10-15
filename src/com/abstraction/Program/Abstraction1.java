package com.abstraction.Program;

public class Abstraction1 {

	public static void main(String[] args) {
		Car c=new Car();
		c.start();
		Scooter s=new Scooter();
		s.start();
		//Vehicle v=new Vehicle();//we can't create object for abstract class
	}
}
abstract class Vehicle{
	int nooftyres;
	abstract void start();
}
class Car extends Vehicle{
	void start() {
		System.out.println("it will start with key");
	}
}
class Scooter extends Vehicle{
	void start() {
		System.out.println("it will start with kick");
	}
}
