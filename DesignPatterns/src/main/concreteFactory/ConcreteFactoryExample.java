package main.concreteFactory;

public class ConcreteFactoryExample {
	public static void main(String[] args) {
		// Only one factory class needed
		VehicleFactory vehicleFactory = new VehicleFactory();
		
		// Passing a parameter to the method itself on the Factory method to get a different type
		Vehicle car1 = vehicleFactory.getVehicle("CAR");
		car1.move();
		
		Vehicle truck1 = vehicleFactory.getVehicle("TRUCK");
		truck1.move();
		
		Vehicle car2 = vehicleFactory.getVehicle("CAR");
		car2.move();
	}
}
