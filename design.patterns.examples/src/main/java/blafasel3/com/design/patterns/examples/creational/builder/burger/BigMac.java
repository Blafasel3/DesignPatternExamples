package blafasel3.com.design.patterns.examples.creational.builder.burger;

public class BigMac implements Burger {

	@Override
	public String getName() {
		return BigMac.class.getSimpleName();
	}

	@Override
	public double getPrice() {
		return 3.50;
	}

}
