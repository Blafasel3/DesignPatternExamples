package blafasel3.com.design.patterns.examples.structural.adapter;

import org.apache.commons.lang3.StringUtils;

public class ContactDataProvider implements ContactData {

	@Override
	public String getEmail(String personId) {
		Person person = PersonDatabase.getPerson(personId);
		return person != null ? person.geteMail() : StringUtils.EMPTY;
	}

	@Override
	public String getPhoneNumber(String personId) {
		Person person = PersonDatabase.getPerson(personId);
		return person != null ? person.getPhoneNumber() : StringUtils.EMPTY;
	}

}
