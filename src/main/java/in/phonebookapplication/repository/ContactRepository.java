package in.phonebookapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.phonebookapplication.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
