package blafasel3.com.design.patterns.examples.behavioral.iterator;

public class IteratorDemoRunner {

	public static void run() {
		System.out.println("#############################");
		System.out.println("Iterator Demo");
		NameRepository nameRepository = new NameRepository(new String[] { "Loop", "Max" });
		Iterator<String> iterator = nameRepository.getIterator();
		while (iterator.hasNext()) {
			System.out.println("Name: " + iterator.next());
		}
	}

}
