package blafasel3.com.design.patterns.examples.behavioral.iterator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NameRepositoryTest {

	@Test
	@DisplayName("Should work with null array")
	void shouldWorkWithNullArray() {
		NameRepository testClass = new NameRepository(null);
		Iterator<String> nameIterator = testClass.getIterator();
		assertFalse(nameIterator.hasNext());
		assertNull(nameIterator.next());
	}

	@Test
	@DisplayName("Should work with empty array")
	void shouldWorkWithEmptyArray() {
		NameRepository testClass = new NameRepository(new String[] {});
		Iterator<String> nameIterator = testClass.getIterator();
		assertFalse(nameIterator.hasNext());
		assertNull(nameIterator.next());
	}

	@Test
	@DisplayName("Should work with array")
	void shouldIterateThruAllNames() {
		String[] expectedNames = new String[] { "Robert", "John", "Julie", "Lora" };
		NameRepository testClass = new NameRepository(expectedNames);
		Iterator<String> nameIterator = testClass.getIterator();

		for (String string : expectedNames) {
			assertTrue(nameIterator.hasNext());
			assertEquals(string, nameIterator.next());
		}

		// new instance
		nameIterator = testClass.getIterator();
		int i = 0;
		while (nameIterator.hasNext()) {
			assertEquals(expectedNames[i], nameIterator.next());
			++i;
		}
	}
}
