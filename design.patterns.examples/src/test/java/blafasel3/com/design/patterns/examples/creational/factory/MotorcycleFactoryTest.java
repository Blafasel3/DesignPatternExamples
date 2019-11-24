package blafasel3.com.design.patterns.examples.creational.factory;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MotorcycleFactoryTest {

	VehicleFactory testClass;

	@BeforeEach()
	void beforeEach() {
		testClass = new MotorcycleFactory();
	}

	@Test
	@DisplayName("Should return vehicle of type motorcycle")
	void shouldReturnMotorcycle() {
		Vehicle result = testClass.produceVehicle();
		assertTrue(result instanceof Motorcycle);
	}
}
