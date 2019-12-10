package blafasel3.com.design.patterns.examples.behavioral.observer;

public class ObserverDemoRunner {

	public static void run() {
		System.out.println("#############################");
		System.out.println(Observer.class.getSimpleName());
		Subject<String> subject = new Subject<String>();
		subject.setValue("Nothing happens");
		Observer<String> observer1 = new Observer<String>();
		subject.subscribe(observer1);
		subject.setValue("Someone listens to me!!");
		Observer<String> observer2 = new Observer<String>();
		subject.subscribe(observer2);
		subject.setValue("Two is a crowd!!");
		
		subject.unsubscribe(observer2);
		subject.setValue("No, don't go please!");
		
	}
}
