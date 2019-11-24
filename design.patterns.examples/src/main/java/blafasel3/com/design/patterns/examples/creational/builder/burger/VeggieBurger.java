package blafasel3.com.design.patterns.examples.creational.builder.burger;

public class VeggieBurger implements Burger {

	@Override
	public String getName() {
		return VeggieBurger.class.getSimpleName();
	}

	@Override
	public double getPrice() {
		return 3.20;
	}

	@Override
	public boolean isVegetarian() {
		return true;
	}

}
