package blafasel3.com.design.patterns.examples.creational.builder.burger;

import blafasel3.com.design.patterns.examples.creational.builder.MenuItem;
import blafasel3.com.design.patterns.examples.creational.builder.Packing;
import blafasel3.com.design.patterns.examples.creational.builder.Wrapper;

/**
 * Example as found on
 * https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 */
public interface Burger extends MenuItem {

	default Packing getPacking() {
		return new Wrapper();
	}
}
