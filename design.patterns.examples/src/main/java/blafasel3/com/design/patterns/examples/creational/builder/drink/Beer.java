package blafasel3.com.design.patterns.examples.creational.builder.drink;

public class Beer implements Drink {

	@Override
	public String getName() {
		return Beer.class.getSimpleName();
	}

	@Override
	public double getPrice() {
		return 2.50;
	}

}
