package blafasel3.com.design.patterns.examples;

import blafasel3.com.design.patterns.examples.creational.builder.MenuBuilder;

public class Demos {
	public static void main(String[] args) {
		MenuBuilder menuBuilder = new MenuBuilder();
		System.out.println(menuBuilder.prepareVegMeal());
		System.out.println(menuBuilder.prepareNonVegMeal());
	}
}
