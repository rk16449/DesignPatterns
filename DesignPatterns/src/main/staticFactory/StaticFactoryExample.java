package main.staticFactory;

public class StaticFactoryExample {
	public static void main(String[] args) {
		
		// No need to create an instance of VehicleFactory, just use the static method
		
		Vehicle car1 = VehicleFactory.getVehicle("CAR");
		car1.move();
		
		
	}
}
