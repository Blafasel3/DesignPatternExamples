package blafasel3.com.design.patterns.examples.creational.builder.sidedish;

public class FrenchFries implements Sidedish {

	@Override
	public String getName() {
		return FrenchFries.class.getSimpleName();
	}

	@Override
	public double getPrice() {
		return 1.99;
	}

	@Override
	public boolean isVegetarian() {
		return true;
	}

}
