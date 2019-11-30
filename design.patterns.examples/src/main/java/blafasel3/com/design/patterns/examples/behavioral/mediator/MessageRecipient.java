package blafasel3.com.design.patterns.examples.behavioral.mediator;

public class MessageRecipient {

	private String name;

	public MessageRecipient(String name) {
		this.name = name;
	}

	public void showMessage(String message) {
		System.out.println(name + " received message: " + message);
	}

}
