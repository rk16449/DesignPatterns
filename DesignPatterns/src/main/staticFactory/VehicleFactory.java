package main.staticFactory;

public class VehicleFactory {
	
	// Difference here is that it is 'static'
	public static Vehicle getVehicle(String vehicleType) {
		
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
