package blafasel3.com.design.patterns.examples.creational.factory;

public class TruckFactory extends VehicleFactory {

	@Override
	public Vehicle produceVehicle() {
		return new Truck();
	}

}
