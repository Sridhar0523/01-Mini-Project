package in.phonebookapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.phonebookapplication.model.PhoneBook;

public interface PhoneBookRepository extends JpaRepository<PhoneBook, Long> {

}
