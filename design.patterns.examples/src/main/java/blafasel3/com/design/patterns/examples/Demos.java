package blafasel3.com.design.patterns.examples;

import blafasel3.com.design.patterns.examples.creational.builder.Meal;
import blafasel3.com.design.patterns.examples.creational.builder.MealBuilder;

public class Demos {
	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getPrice());

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getPrice());
	}
}
