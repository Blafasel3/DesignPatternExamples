package blafasel3.com.design.patterns.examples.behavioral.iterator;

import java.util.Arrays;

public class NameRepository {
	public String[] names;

	public NameRepository(String[] names) {
		this.names = names;
	}

	public Iterator<String> getIterator() {
		return new NameIterator();
	}

	class NameIterator implements Iterator<String> {
		int index = 0;

		@Override
		public String next() {
			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}

		@Override
		public boolean hasNext() {
			return names != null && index < names.length;
		}

	}
}
