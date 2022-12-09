package in.phonebookapplication.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;

import in.phonebookapplication.model.PhoneBook;

public class PhoneBookApplicationController {

	// Create Contact
	public PhoneBook createContact() {
		return null;
	}

	// Display All Contacts
	public List<PhoneBook> getAllContacts() {
		return null;
	}

	// Edit and Update Contact Details
	public ResponseEntity<PhoneBook> updateContact() {
		return null;
	}
	
	//Delete Contact
	@DeleteMapping("/contact/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteContact() {
		return null;
	}

}
