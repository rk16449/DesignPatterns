package assignment.factory;

public class AnimalFactory extends AnimalFactoryInterface{
	@Override
	public Animal createAnimal(String animalType) throws Exception{
		
		if(animalType == null)
			return null;
		
		if(animalType.equalsIgnoreCase("TIGER")) {
			return new Tiger();
		}else if(animalType.equalsIgnoreCase("DUCK")) {
			return new Duck();
		}
		
		throw new Exception("Animal type: " + animalType + " cannot be initiated!");
	}
}
