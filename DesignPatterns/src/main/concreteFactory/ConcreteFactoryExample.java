package main.concreteFactory;

public class ConcreteFactoryExample {
	public static void main(String[] args) {
		
		VehicleFactory vehicleFactory = new VehicleFactory();
		
		Vehicle car1 = vehicleFactory.getVehicle("CAR");
		car1.move();
		
		Vehicle truck1 = vehicleFactory.getVehicle("TRUCK");
		truck1.move();
		
		Vehicle car2 = vehicleFactory.getVehicle("CAR");
		car2.move();
	}
}
