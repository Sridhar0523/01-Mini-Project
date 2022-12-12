package in.phonebookapplication.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.phonebookapplication.model.Contact;
import in.phonebookapplication.repository.ContactRepository;
import in.phonebookapplication.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository repo;

	@Override
	public String saveContact(Contact contact) {

		// insertion
		contact = repo.save(contact);

		if (contact.getContactId() != null) {
			return "Contact Saved";
		} else {
			return "Contact failed to save";
		}
	}

	@Override
	public List<Contact> getAllContacts() {

		return repo.findAll();
	}

	@Override
	public Contact getContactById(Integer contactId) {

		Optional<Contact> findById = repo.findById(contactId);

		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	// Update Operation
	@Override
	public String updateContact(Contact contact) {

		if (repo.existsById(contact.getContactId())) {
			repo.save(contact);
			return "Update Success";
		} else {
			return "No Record Found";
		}
	}

	@Override
	public String deleteContactById(Integer contactId) {

		if (repo.existsById(contactId)) {
			repo.deleteById(contactId);
			return "Record Deleted";
		} else {
			return "No Record Found";
		}
	}

}
