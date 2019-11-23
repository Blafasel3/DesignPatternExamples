package blafasel3.com.design.patterns.examples.creational.factory;

public class MotorcycleFactory extends VehicleFactory {

	@Override
	public Vehicle produceVehicle() {
		return new Motorcycle();
	}

}
