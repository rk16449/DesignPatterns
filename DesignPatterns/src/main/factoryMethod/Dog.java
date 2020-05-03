package main.factoryMethod;

public class Dog implements Animal {

	@Override
	public void breath() {
		System.out.println("breathing...");
	}

	@Override
	public void eat() {
		System.out.println("Eating...");
	}
}
