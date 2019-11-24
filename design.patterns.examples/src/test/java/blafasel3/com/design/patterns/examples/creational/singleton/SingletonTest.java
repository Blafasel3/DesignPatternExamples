package blafasel3.com.design.patterns.examples.creational.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import blafasel3.com.design.patterns.examples.creational.singleton.Singleton;

class SingletonTest {

	@Test
	void shouldReturnSameInstance() {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		assertEquals(singleton1, singleton2);
		assertEquals(singleton1.getRandomValue(), singleton2.getRandomValue());
	}
}
