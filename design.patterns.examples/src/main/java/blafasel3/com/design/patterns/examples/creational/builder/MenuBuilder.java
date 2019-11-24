package blafasel3.com.design.patterns.examples.creational.builder;

import blafasel3.com.design.patterns.examples.creational.builder.burger.BigMac;
import blafasel3.com.design.patterns.examples.creational.builder.burger.VeggieBurger;
import blafasel3.com.design.patterns.examples.creational.builder.drink.Coke;

public class MenuBuilder {

	public Menu prepareVegMeal() {
		Menu meal = new Menu("Veggie Meal");
		meal.addItem(new VeggieBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Menu prepareNonVegMeal() {
		Menu meal = new Menu("Big Mac Menu");
		meal.addItem(new BigMac());
		meal.addItem(new Coke());
		return meal;
	}
}