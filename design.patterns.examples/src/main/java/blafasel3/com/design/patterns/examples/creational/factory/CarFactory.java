package blafasel3.com.design.patterns.examples.creational.factory;

public class CarFactory extends VehicleFactory {

	@Override
	public Vehicle produceVehicle() {
		return new Car();
	}

}
