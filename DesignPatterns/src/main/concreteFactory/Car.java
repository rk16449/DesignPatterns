package main.concreteFactory;

public class Car implements Vehicle {

	@Override
	public void move() {
		System.out.println("Inside Car::move() method");
	}
}
