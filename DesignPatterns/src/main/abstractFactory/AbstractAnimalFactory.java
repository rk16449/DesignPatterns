package main.abstractFactory;

/*
	There are 3 common implementations of the factory method pattern
	the first one is the 'strictest' implementation of the pattern

		* the creator class is an abstract class

		* you create a subclass of the creator class for each product type which contains an
			implementation of the factory method

		* to use the factory method (create objects), you simply specify an instance of that type
			and invoke the factory method 
*/
public abstract class AbstractAnimalFactory {
	
	protected abstract Animal factoryMethod();
	
	public Animal getAnimal() {
		return factoryMethod();
	}
	
	// other helper methods here
}

class DogFactory extends AbstractAnimalFactory{
	@Override
	protected Animal factoryMethod() {
		return new Dog();
	}
}

class CatFactory extends AbstractAnimalFactory{
	@Override
	protected Animal factoryMethod() {
		return new Cat();
	}
}

class FoxFactory extends AbstractAnimalFactory{
	@Override
	protected Animal factoryMethod() {
		return new Fox();
	}
}
