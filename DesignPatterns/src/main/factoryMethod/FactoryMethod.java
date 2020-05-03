package main.factoryMethod;

public class FactoryMethod {
	public static void main(String[] args) {
		// Create the different types of products using factory methods
		
		// get an object of Cat and call its eat method
		Animal cat1 = new CatFactory().getAnimal();
		cat1.eat();
		
		// get an object of Fox call breath
		Animal fox1 = new FoxFactory().getAnimal();
		fox1.breath();
		
		// get an object of Dog call eat
		Animal dog1 = new DogFactory().getAnimal();
		dog1.eat();
	}
}
