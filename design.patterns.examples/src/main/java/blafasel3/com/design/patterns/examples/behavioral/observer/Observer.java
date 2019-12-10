package blafasel3.com.design.patterns.examples.behavioral.observer;

import java.util.Collection;
import java.util.HashSet;

public class Observer<T> {

	private final Collection<Subject<T>> subjects;

	public Observer() {
		this.subjects = new HashSet<Subject<T>>();
	}
	
	public void addSubscription(Subject<T> subject) {
		subject.subscribe(this);
		this.subjects.add(subject);
	}

	public void update(T value) {
		System.out.println(this.hashCode() + " received value " + value);
	}

	public void stopObservation() {
		this.subjects.forEach((Subject<T> subject) -> subject.unsubscribe(this));
	}
}
