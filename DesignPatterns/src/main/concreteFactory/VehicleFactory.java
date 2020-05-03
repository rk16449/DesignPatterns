package main.concreteFactory;

public class VehicleFactory {
	
	// use getVehicle method to get an object of type Vehicle
	public Vehicle getVehicle(String vehicleType) {
		
		// Validate that we don't have nulls
		if(vehicleType == null)
			return null;
		else if(vehicleType.equalsIgnoreCase("CAR")) 
			return new Car();
		else if(vehicleType.equalsIgnoreCase("TRUCK"))
			return new Truck();
		
		return null;
	}
}
