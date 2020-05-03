package assignment.factory;

public class Tiger implements Animal {

	@Override
	public void eat() {
	}

	@Override
	public void sleep() {
	}

	@Override
	public void breath() {
		System.out.println("called in Tiger::breath()");
	}

}
