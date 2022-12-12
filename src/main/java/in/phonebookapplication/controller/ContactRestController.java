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
public class ContactRestController {

	@Autowired
	private ContactService service;

	// Create Contact
	@PostMapping("/contact")
	public String createContact(@RequestBody Contact contact) {
		String status = service.saveContact(contact);
		return status;
	}

	// Display All Contacts
	@GetMapping("/allcontacts")
	public List<Contact> getAllContacts() {
		return service.getAllContacts();
	}

	// get ContactById
	@GetMapping("/contact/{contactid}")
	public Contact getContactById(@PathVariable Integer contactid) {
		return service.getContactById(contactid);
	}

	// Edit and Update Contact Details
	@PutMapping("/contact")
	public String updateContact(@RequestBody Contact contact) {
		return service.updateContact(contact);
	}

	// Delete Contact
	@DeleteMapping("/contact/{contactid}")
	public String deleteContact(@PathVariable Integer contactid) {
		return service.deleteContactById(contactid);
	}

}
