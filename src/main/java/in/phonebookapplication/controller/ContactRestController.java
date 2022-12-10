package in.phonebookapplication.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import in.phonebookapplication.model.Contact;


public class ContactRestController {

	// Create Contact
	@PostMapping("/save")
	public Contact saveContact() {
		return null;
	}

	// Display All Contacts
	@GetMapping("/all")
	public List<Contact> getAllContacts() {
		return null;
	}
	
	//get ContactById
	@GetMapping("/contact/{id}")
	public ResponseEntity<Map<String, Boolean>> getContactById() {
		return null;
	}

	// Edit and Update Contact Details
	@PutMapping("/modify/{id}")
	public ResponseEntity<Contact> updateContact() {
		return null;
	}
	
	//Delete Contact
	@DeleteMapping("/contact/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteContactById() {
		return null;
	}

}
