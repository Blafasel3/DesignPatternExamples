package blafasel3.com.design.patterns.examples.creational.builder.sidedish;

import blafasel3.com.design.patterns.examples.creational.builder.MenuItem;
import blafasel3.com.design.patterns.examples.creational.builder.Packing;
import blafasel3.com.design.patterns.examples.creational.builder.Wrapper;

public interface Sidedish extends MenuItem {
	default Packing getPacking() {
		return new Wrapper();
	}
}
