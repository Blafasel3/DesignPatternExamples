package blafasel3.com.design.patterns.examples.creational.factory;

public class Truck implements Vehicle {

	@Override
	public String getColor() {
		return "blue";
	}

	@Override
	public double getMileage() {
		return 0;
	}

	@Override
	public int getMaxPassengerCount() {
		return 3;
	}

}
