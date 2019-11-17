package blafasel3.com.design.patterns.examples.creational.singleton;

/**
 * Singleton is a creational pattern. It forces the application to always use the same instance of the given class.
 * It mimics the behavior of global variables.
 * 
 * Advantages:
 * - access control
 * - instance only created when required
 *
 * Disadvantages:
 * - Pollution
 * - Multithreading / multiple class loaders cause several instances to exist
 */
public class Singleton {

	private static Singleton instance = null;
	
	private double randomValue;
	
	/**
	 * The constructor is private so it can only accessed by the class itself. See getInstance().
	 */
	private Singleton() {
		this.randomValue = Math.random();
	}
	
	/**
	 * Static getter method for the single instance.
	 * @return The single instance
	 */
	public static Singleton getInstance() {
		// instantiate the first time this is called.
		if(Singleton.instance == null) {
			Singleton.instance = new Singleton();
		}
		return Singleton.instance;
	}
	
	public double getRandomValue() {
		return this.randomValue;
	}
}
