package blafasel3.com.design.patterns.examples.creational.builder;

public class BuilderDemoRunner {

	public static void run() {
		System.out.println("#############################");
		System.out.println("Builder Demo");
		MenuBuilder menuBuilder = new MenuBuilder();
		System.out.println(menuBuilder.prepareVegMeal());
		System.out.println(menuBuilder.prepareNonVegMeal());
	}
}
