package main.abstractFactory;

public class Dog implements Animal {

	@Override
	public void breath() {
		System.out.println("Dog is breathing...");
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating...");
	}
}
