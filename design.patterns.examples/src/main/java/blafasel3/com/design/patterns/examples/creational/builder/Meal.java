package blafasel3.com.design.patterns.examples.creational.builder;

import java.util.ArrayList;

/**
 * Example as found on
 * https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 */
public class Meal {

	private ArrayList<MealItem> mealItems = new ArrayList<MealItem>();
	private double price;

	public void addItem(MealItem mealItem) {
		this.mealItems.add(mealItem);

		this.price = this.mealItems //
				.stream() //
				.map(item -> item.getPrice()) //
				.reduce(0.00, (Double price1, Double price2) -> price1 += price2);

	}

	public double getPrice() {
		return this.price;
	}

	public String showItems() {
		this.mealItems.stream().forEach(item -> {
			System.out.println(item.getName() + ": " + item.getPrice());
		});
		return "";
	}

}
