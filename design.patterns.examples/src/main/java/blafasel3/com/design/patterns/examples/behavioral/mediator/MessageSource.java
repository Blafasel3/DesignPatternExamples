package blafasel3.com.design.patterns.examples.behavioral.mediator;

import java.util.HashSet;
import java.util.Set;

public class MessageSource {

	private Set<MessageBroker> messageBrokers = new HashSet<MessageBroker>();
	private String name;

	public MessageSource(String name) {
		this.name = name;
	}

	public void sendMessage(String message) {
		this.messageBrokers.stream()
				.forEach((MessageBroker messageBroker) -> messageBroker.brokerMessage(this.name, message));
	}

	public void addMessageBroker(MessageBroker messageBroker) {
		if (messageBroker != null && !this.messageBrokers.contains(messageBroker)) {
			this.messageBrokers.add(messageBroker);
		}
	}

}
