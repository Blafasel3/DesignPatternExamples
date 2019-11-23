package blafasel3.com.design.patterns.examples.creational.builder.drink;

public class Coke implements Drink {

	@Override
	public String getName() {
		return Coke.class.getSimpleName();
	}

	@Override
	public double getPrice() {
		return 1.50;
	}

	@Override
	public boolean isVegetarian() {
		return false;
	}

}
