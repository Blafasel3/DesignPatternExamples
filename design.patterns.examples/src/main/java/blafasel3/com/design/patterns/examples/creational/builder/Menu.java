package blafasel3.com.design.patterns.examples.creational.builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.apache.commons.lang3.StringUtils;

/**
 * Example as found on
 * https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 */
public class Menu implements Vegetarian {

	private Collection<MenuItem> mealItems = new ArrayList<MenuItem>();
	private double price;
	private String menuName;

	public Menu(String menuName) {
		this.menuName = menuName;
	}

	public void addItem(MenuItem mealItem) {
		this.mealItems.add(mealItem);

		this.price = this.mealItems //
				.stream() //
				.map((MenuItem item) -> item.getPrice()) //
				.reduce(0.00, (Double price1, Double price2) -> price1 += price2);

	}

	public double getPrice() {
		return this.price;
	}

	public String showItems() {
		this.mealItems.stream().forEach(mealItem -> {
			System.out.println(mealItem.getName() + ": " + mealItem.getPrice());
		});
		this.mealItems.stream().forEach(mealItem -> {
			System.out.println(mealItem.getName() + ": " + mealItem.getPrice());
		});
		return StringUtils.EMPTY;
	}

	public Collection<MenuItem> getItems() {
		return Collections.unmodifiableCollection(this.mealItems);
	}

	@Override
	public boolean isVegetarian() {
		return this.mealItems.stream().anyMatch((MenuItem mealItem) -> mealItem.isVegetarian());
	}

	public String getMenuName() {
		return menuName;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		this.mealItems.stream().forEach(mealItem -> {
			sb.append(mealItem.getName());
			sb.append(": ");
			sb.append(mealItem.getPrice());
			sb.append("\n");
		});
		sb.append(this.isVegetarian() ? "Vegetarian" : "Non Vegetarian");
		sb.append("\n");
		return sb.toString();
	}
}
