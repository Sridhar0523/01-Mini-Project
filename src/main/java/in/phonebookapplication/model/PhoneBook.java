package in.phonebookapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "phonebook")
@Data
public class PhoneBook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String name;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "phone_Number")
	private String phoneNumber;

}



/*CREATE TABLE `phonebookapplication`.`new_table` (
  `Contact_ID` INT NOT NULL,
  `Contact_Name` VARCHAR(45) NULL,
  `Contact_Email` VARCHAR(45) NULL,
  `Contact_Number` INT NULL,
  PRIMARY KEY (`Contact_ID`));*/