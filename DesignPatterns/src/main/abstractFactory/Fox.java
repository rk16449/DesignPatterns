package main.abstractFactory;

public class Fox implements Animal {

	@Override
	public void breath() {
		System.out.println("Fox is breathing...");
	}

	@Override
	public void eat() {
		System.out.println("Fox is eating...");
	}

}
