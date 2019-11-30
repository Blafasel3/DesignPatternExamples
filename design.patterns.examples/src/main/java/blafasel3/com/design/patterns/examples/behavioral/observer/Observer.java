package blafasel3.com.design.patterns.examples.behavioral.observer;

public class Observer<T> {

	public Observer(Subject<T> subject) {
		subject.subscribe(this);
	}

	public void update(T value) {
		System.out.println(this.hashCode() + " received value " + value);
	}
}
