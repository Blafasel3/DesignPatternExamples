package blafasel3.com.design.patterns.examples.creational.builder.sidedish;

import blafasel3.com.design.patterns.examples.creational.builder.MealItem;
import blafasel3.com.design.patterns.examples.creational.builder.Packing;
import blafasel3.com.design.patterns.examples.creational.builder.Wrapper;

public interface Sidedish extends MealItem {
	default Packing getPacking() {
		return new Wrapper();
	}
}
