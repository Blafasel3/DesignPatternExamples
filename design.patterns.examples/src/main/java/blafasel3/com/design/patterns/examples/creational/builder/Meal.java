package blafasel3.com.design.patterns.examples.creational.builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Example as found on
 * https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 */
public class Meal implements Vegetarian {

	private Collection<MealItem> mealItems = new ArrayList<MealItem>();
	private double price;

	public void addItem(MealItem mealItem) {
		this.mealItems.add(mealItem);

		this.price = this.mealItems //
				.stream() //
				.map((MealItem item) -> item.getPrice()) //
				.reduce(0.00, (Double price1, Double price2) -> price1 += price2);

	}

	public double getPrice() {
		return this.price;
	}

	public String showItems() {
		this.mealItems.stream().forEach(mealItem -> {
			System.out.println(mealItem.getName() + ": " + mealItem.getPrice());
		});
		return "";
	}

	public Collection<MealItem> getItems() {
		return Collections.unmodifiableCollection(this.mealItems);
	}

	@Override
	public boolean isVegetarian() {
		return this.mealItems.stream().anyMatch((MealItem mealItem) -> mealItem.isVegetarian());
	}

}
