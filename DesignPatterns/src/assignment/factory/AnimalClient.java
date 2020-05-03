package assignment.factory;

public class AnimalClient {
	public static void main(String[] args) throws Exception{
		AnimalFactory factory = new AnimalFactory();
		
		Animal tiger1 = factory.createAnimal("TIGER");
		tiger1.breath();
		
		Animal duck1 = factory.createAnimal("DUCK");
		duck1.eat();
	}
}
