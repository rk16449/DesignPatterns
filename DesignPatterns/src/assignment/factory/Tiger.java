package assignment.factory;

public class Tiger implements Animal {

	@Override
	public void eat() {
		System.out.println("in Tiger::eat()");
	}

	@Override
	public void sleep() {
		System.out.println("in Tiger::sleep()");
	}

	@Override
	public void breath() {
		System.out.println("in Tiger::breath()");
	}
}
