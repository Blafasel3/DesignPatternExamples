package blafasel3.com.design.patterns.examples.behavioral.observer;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SubjectTest {

	@Mock
	Observer<String> observableMock;

	private Subject<String> subject;

	private final String value = "testvalue";

	@BeforeEach
	void beforeEach() {
		this.subject = new Subject<String>();
	}

	@Test
	@DisplayName("setValue should call observable if it subscribes")
	void test() {
		this.subject.setValue(value);
		verify(observableMock, never()).update(Mockito.anyString());

		subject.subscribe(observableMock);
		verify(observableMock, times(1)).update(value);

		this.subject.setValue(value);
		verify(observableMock, times(2)).update(value);

		subject.unsubscribe(observableMock);
		this.subject.setValue(value);
		verify(observableMock, times(2)).update(Mockito.anyString());
	}

	@Test
	@DisplayName("subject should not call same observer twice")
	void testNotCalledTwice() {
		subject.subscribe(observableMock);
		subject.subscribe(observableMock);
		this.subject.setValue(value);
		verify(observableMock, times(1)).update(value);

		subject.unsubscribe(observableMock);
		this.subject.setValue(value);
		verify(observableMock, times(1)).update(Mockito.anyString());
	}

	@Test
	@DisplayName("Should call observer on subscription")
	void y() {
		subject.setValue(value);
		subject.subscribe(observableMock);
		verify(observableMock, times(1)).update(value);
	}

}
