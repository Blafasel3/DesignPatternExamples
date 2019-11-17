package blafasel3.com.design.patterns.examples.creational.factory;

/**
 *
 *
 */
public class VehicleFactory {
	
	public Vehicle getVehicle(VehicleType vehicleType) {
		switch (vehicleType) {
		case CAR:
			return new Car();
		case MOTORCYCLE:
			return new Motorcycle();
		case TRUCK:
			return new Truck();
		default:
			throw new IllegalArgumentException("Unexpected value: " + vehicleType);
		}
	}
}
