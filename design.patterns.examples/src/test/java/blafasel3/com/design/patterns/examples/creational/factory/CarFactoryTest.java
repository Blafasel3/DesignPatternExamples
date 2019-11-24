package blafasel3.com.design.patterns.examples.creational.factory;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarFactoryTest {

	VehicleFactory testClass;

	@BeforeEach()
	void beforeEach() {
		testClass = new CarFactory();
	}

	@Test
	@DisplayName("Should return vehicle of type car")
	void shouldReturnCarIfCalledWithVehicleTypeCar() {
		Vehicle result = testClass.produceVehicle();
		assertTrue(result instanceof Car);
	}
}
