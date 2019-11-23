package blafasel3.com.design.patterns.examples.creational.builder.sidedish;

public class Salad implements Sidedish {

	@Override
	public String getName() {
		return Salad.class.getSimpleName();
	}

	@Override
	public double getPrice() {
		return 2.99;
	}

}
