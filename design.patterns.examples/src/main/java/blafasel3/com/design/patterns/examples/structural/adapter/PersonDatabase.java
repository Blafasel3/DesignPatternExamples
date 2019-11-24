package blafasel3.com.design.patterns.examples.structural.adapter;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PersonDatabase {

	private static Map<String, Person> personDataById;

	static {
		Map<String, Person> initMap = new HashMap<String, Person>();
		initMap.put("batman", new Person("Bruce", "Wayne", "bat@man.com", "+1234"));
		PersonDatabase.personDataById = Collections.unmodifiableMap(initMap);
	}

	public static Person getPerson(String id) {
		return PersonDatabase.personDataById.get(id.toLowerCase());
	}
}
