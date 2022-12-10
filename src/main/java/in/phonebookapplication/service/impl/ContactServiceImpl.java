package in.phonebookapplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import in.phonebookapplication.model.Contact;
import in.phonebookapplication.repository.ContactRepository;
import in.phonebookapplication.service.ContactService;

public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository repo;

	@Override
	public String saveContact(Contact contact) {

		return null;
	}

	@Override
	public List<Contact> getAllContacts() {

		return null;
	}

	@Override
	public Contact getContactById(Integer contactId) {

		return null;
	}

	@Override
	public String updateContact(Contact contact) {

		return null;
	}

	@Override
	public String deleteContactById(Integer contactId) {

		return null;
	}

}
