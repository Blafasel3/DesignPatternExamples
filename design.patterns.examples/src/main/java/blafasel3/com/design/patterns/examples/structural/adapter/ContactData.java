package blafasel3.com.design.patterns.examples.structural.adapter;

/**
 * Adapter Pattern. <br>
 * An Adapter Pattern says that just "converts the interface of a class into
 * another interface that a client wants". In other words, to provide the
 * interface according to client requirement while using the services of a class
 * with a different interface. The Adapter Pattern is also known as Wrapper.
 * Description & Example found on https://www.javatpoint.com/adapter-pattern.
 */
public interface ContactData {
	String getEmail(String personId);

	String getPhoneNumber(String personId);
}
