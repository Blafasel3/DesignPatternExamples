package blafasel3.com.design.patterns.examples.creational.builder;

/**
 * Example as found on
 * https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 */
public interface MealItem extends Vegetarian {
	String getName();

	Packing getPacking();

	double getPrice();
}
