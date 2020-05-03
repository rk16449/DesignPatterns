package assignment.factory;

public class Duck implements Animal {

	@Override
	public void eat() {
		System.out.println("in Duck::eat()");
	}

	@Override
	public void sleep() {
		System.out.println("in Duck::sleep()");
	}

	@Override
	public void breath() {
		System.out.println("in Duck::breath()");
	}
}
