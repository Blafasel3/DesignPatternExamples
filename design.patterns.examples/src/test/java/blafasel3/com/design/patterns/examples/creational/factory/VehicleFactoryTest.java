package blafasel3.com.design.patterns.examples.creational.factory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VehicleFactoryTest {

	VehicleFactory testClass;

	@BeforeEach()
	void beforeEach() {
		testClass = new VehicleFactory();
	}

	@Test
	@DisplayName("Should throw IllegalArgumentException if called with VehicleType.JUNK_CAR")
	void shouldThrowIllegalArgumentExceptionIfCalledWithNull() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
				() -> testClass.getVehicle(VehicleType.JUNK_CAR));

		assertEquals(exception.getMessage(), "Unexpected value: " + VehicleType.JUNK_CAR);
	}

	@Test
	@DisplayName("Should return vehicle of type car if called with VehicleType.CAR")
	void shouldReturnCarIfCalledWithVehicleTypeCar() {
		Vehicle result = testClass.getVehicle(VehicleType.CAR);
		assertTrue(result instanceof Car);
	}

	@Test
	@DisplayName("Should return vehicle of type car if called with VehicleType.MOTORCYCLE")
	void shouldReturnMotorcycleIfCalledWithVehicleTypMotorcycle() {
		Vehicle result = testClass.getVehicle(VehicleType.MOTORCYCLE);
		assertTrue(result instanceof Motorcycle);
	}

	@Test
	@DisplayName("Should return vehicle of type car if called with VehicleType.TRUCK")
	void shouldReturnTruckIfCalledWithVehicleTypeTruck() {
		Vehicle result = testClass.getVehicle(VehicleType.TRUCK);
		assertTrue(result instanceof Truck);
	}

}
