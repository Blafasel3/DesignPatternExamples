package blafasel3.com.design.patterns.examples.structural.adapter;

/**
 * POJO
 */
public class Person {
	private String name;
	private String firstName;
	private String eMail;
	private String phoneNumber;

	public Person(String name, String firstName, String eMail, String phoneNumber) {
		this.name = name;
		this.firstName = firstName;
		this.eMail = eMail;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getFirstName() {
		return firstName;
	}

	public String geteMail() {
		return eMail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
}
