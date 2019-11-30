package blafasel3.com.design.patterns.examples.behavioral.mediator;

import java.util.HashSet;
import java.util.Set;

public class MessageBroker {

	private Set<MessageRecipient> messageRecipients = new HashSet<MessageRecipient>();

	public void brokerMessage(String source, String message) {
		System.out.println("[Source]: " + source + " [Message]: " + message);
		this.messageRecipients.stream()
				.forEach((MessageRecipient messageRecipient) -> messageRecipient.showMessage(message));
	}

	public void subscribe(MessageRecipient messageRecipient) {
		if (messageRecipient != null && !this.messageRecipients.contains(messageRecipient)) {
			this.messageRecipients.add(messageRecipient);
		}
	}
}
