package main.factoryMethod;

public class Cat implements Animal {

	@Override
	public void breath() {
		System.out.println("Breathing...");
	}

	@Override
	public void eat() {
		System.out.println("Eating...");
	}
}
