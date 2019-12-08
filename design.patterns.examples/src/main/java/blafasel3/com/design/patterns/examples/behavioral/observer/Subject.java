package blafasel3.com.design.patterns.examples.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

public class Subject<T> {
	
	private T value;
	
	private final Set<Observer<T>> observers = new HashSet<Observer<T>>();

	public void subscribe(Observer<T> observer) {
		this.observers.add(observer);
		observer.update(this.value);
	}
	
	public void unsubscribe(Observer<T> observer) {
		this.observers.remove(observer);
	}
	
	public T getValue() {
		return this.value;
	}
	
	public void setValue(T value) {
		this.value = value;
		this.observers.stream().forEach(obs -> obs.update(this.value));
	}
}
