package blafasel3.com.design.patterns.examples.creational.factory;

public class Car implements Vehicle {

	@Override
	public String getColor() {
		return "red";
	}

	@Override
	public double getMileage() {
		return 2134.10;
	}

	@Override
	public int getMaxPassengerCount() {
		return 4;
	}
}
