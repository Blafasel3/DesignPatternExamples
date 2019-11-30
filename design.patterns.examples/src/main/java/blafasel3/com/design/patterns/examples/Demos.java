package blafasel3.com.design.patterns.examples;

import blafasel3.com.design.patterns.examples.behavioral.iterator.IteratorDemoRunner;
import blafasel3.com.design.patterns.examples.behavioral.mediator.MediatorDemoRunner;
import blafasel3.com.design.patterns.examples.behavioral.observer.ObserverDemoRunner;
import blafasel3.com.design.patterns.examples.creational.builder.BuilderDemoRunner;
import blafasel3.com.design.patterns.examples.structural.adapter.AdapterDemoRunner;
import blafasel3.com.design.patterns.examples.structural.composite.EmployeeDemoRuner;

public class Demos {
	public static void main(String[] args) {
		BuilderDemoRunner.run();
		AdapterDemoRunner.run();
		IteratorDemoRunner.run();
		MediatorDemoRunner.run();
		EmployeeDemoRuner.run();
		ObserverDemoRunner.run();
	}
}
