package main.concreteFactory;

public class Truck implements Vehicle {

	@Override
	public void move() {
		System.out.println("Inside Truck::move() method");
	}
}
