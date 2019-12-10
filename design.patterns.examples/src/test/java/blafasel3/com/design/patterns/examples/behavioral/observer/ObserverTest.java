package blafasel3.com.design.patterns.examples.behavioral.observer;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ObserverTest {

	@Mock
	Subject<String> subject;

	@Test
	@DisplayName("If subject is passed to constructor, Subject.subscribe should be called  observer as argument")
	void testSingleSubjectSubscribe() {
		Observer<String> observer = new Observer<String>();
		observer.addSubscription(subject);
		verify(subject, times(1)).subscribe(observer);
	}

	@Test
	@DisplayName("If subjects are passed to constructor, Subject.subscribe should be called with observer as argument for each")
	void testMultipleSubjectSubscribe(@Mock Subject<String> secondSubject) {
		Observer<String> observer = new Observer<String>();
		observer.addSubscription(subject);
		observer.addSubscription(secondSubject);

		verify(subject, times(1)).subscribe(observer);
		verify(secondSubject, times(1)).subscribe(observer);
	}

	@Test
	@DisplayName("Observable.stop should unsubscribe from single subject")
	void testStopObservation() {
		Observer<String> observer = new Observer<String>();
		observer.addSubscription(subject);
		verify(subject, times(1)).subscribe(observer);

		observer.stopObservation();
		verify(subject, times(1)).unsubscribe(observer);
	}

	@Test
	@DisplayName("Observable.stop should unsubscribe from all subjects")
	void testStopObservationMultipleSubjects(@Mock Subject<String> secondSubject) {
		Observer<String> observer = new Observer<String>();
		observer.addSubscription(subject);
		verify(subject, times(1)).subscribe(observer);
		observer.addSubscription(secondSubject);

		observer.stopObservation();
		verify(subject, times(1)).unsubscribe(observer);
		verify(secondSubject, times(1)).unsubscribe(observer);
	}

}
