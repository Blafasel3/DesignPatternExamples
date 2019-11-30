package blafasel3.com.design.patterns.examples.behavioral.mediator;

public class MediatorDemoRunner {

	public static void run() {
		System.out.println("#############################");
		System.out.println("Mediator Demo");
		MessageBroker messageBroker = new MessageBroker();

		// Recipients
		MessageRecipient messageRecipientMax = new MessageRecipient("Max");
		messageBroker.subscribe(messageRecipientMax);
		MessageRecipient messageRecipient2 = new MessageRecipient("John");
		messageBroker.subscribe(messageRecipient2);

		// Sources
		MessageSource messageSourceCNN = new MessageSource("Newsflash CNN");
		messageSourceCNN.addMessageBroker(messageBroker);
		messageSourceCNN.sendMessage("Trump did something terrible again!");

		MessageSource messageSourceFoxNews = new MessageSource("Breaking News FoxNews");
		messageSourceFoxNews.addMessageBroker(messageBroker);
		messageSourceFoxNews.sendMessage("Trump did something great again!");

	}

}
