package blafasel3.com.design.patterns.examples.structural.adapter;

public class AdapterDemoRunner {

	public static void run() {
		System.out.println("#############################");
		System.out.println("Adapter Demo");
		ContactData adapter = new ContactDataProvider();
		System.out.println(adapter.getEmail("Batman"));
		System.out.println(adapter.getPhoneNumber("Batman"));
	}
}
