package in.phonebookapplication.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.phonebookapplication.model.Contact;
import in.phonebookapplication.service.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactRestController {

	@Autowired
	private ContactService service;

	// Create Contact
	@PostMapping("/save")
	public ResponseEntity<String> saveContact(@RequestBody Contact contact) {
		String saveContact = service.saveContact(contact);
		return new ResponseEntity<String>("Contact '" + saveContact + "' saved", HttpStatus.OK);
	}

	// Display All Contacts
	@GetMapping("/all")
	public ResponseEntity<List<Contact>> getAllContacts() {
		List<Contact> list = service.getAllContacts();
		return new ResponseEntity<List<Contact>>(list, HttpStatus.OK);
	}

	// get ContactById
	@GetMapping("/contact/{id}")
	public ResponseEntity<Contact> getContactById(@PathVariable Integer id) {
		Contact contact = service.getContactById(id);
		return new ResponseEntity<Contact>(contact, HttpStatus.OK);
	}

	// Edit and Update Contact Details
	@PutMapping("/modify/{id}")
	public ResponseEntity<String> updateContact(@PathVariable Integer id, @RequestBody Contact contact) {
		Contact contactById = service.getContactById(id);
		contactById.setContactName(contact.getContactName());
		contactById.setContactEmail(contact.getContactEmail());
		contactById.setContactNumber(contact.getContactNumber());
		service.saveContact(contactById);
		return new ResponseEntity<String>("Contact '" + id + "' Updated", HttpStatus.OK);
	}

	// Delete Contact
	@DeleteMapping("/contact/{id}")
	public ResponseEntity<String> deleteContactById(@PathVariable Integer id) {
		service.deleteContactById(id);
		return new ResponseEntity<String>("Contact '" + id + "' Deleted", HttpStatus.OK);
	}

}
