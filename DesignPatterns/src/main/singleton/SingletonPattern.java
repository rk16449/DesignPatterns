package main.singleton;

public class SingletonPattern {

	public static void main(String[] args) {
		SingletonClass obj = SingletonClass.getInstance();
		System.out.println(obj.toString());
	}
}
