package blafasel3.com.design.patterns.examples.creational.builder;

import blafasel3.com.design.patterns.examples.creational.builder.burger.BigMac;
import blafasel3.com.design.patterns.examples.creational.builder.burger.VeggieBurger;
import blafasel3.com.design.patterns.examples.creational.builder.drink.Coke;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VeggieBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new BigMac());
		meal.addItem(new Coke());
		return meal;
	}
}