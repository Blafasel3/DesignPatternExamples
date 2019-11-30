package blafasel3.com.design.patterns.examples.behavioral.observer;

public class ObserverDemoRunner {

	public static void run() {
		System.out.println("#############################");
		System.out.println(Observer.class.getSimpleName());
		Subject<String> subject = new Subject<String>();
		subject.setValue("Nothing happens");
		
		new Observer<String>(subject);
		subject.setValue("Someone listens to me!!");
		Observer<String> observer = new Observer<String>(subject);
		subject.setValue("Two is a crowd!!");
		
		subject.unsubscribe(observer);
		subject.setValue("No, don't go please!");
		
	}
}
