package blafasel3.com.design.patterns.examples.creational.builder.drink;

import blafasel3.com.design.patterns.examples.creational.builder.Bottle;
import blafasel3.com.design.patterns.examples.creational.builder.MenuItem;
import blafasel3.com.design.patterns.examples.creational.builder.Packing;

/**
 * Example as found on
 * https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 */
public interface Drink extends MenuItem {
	default Packing getPacking() {
		return new Bottle();
	}
}
