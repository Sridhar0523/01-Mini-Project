package in.phonebookapplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "phonebook")
@Data
public class Contact {

	@Id
	@GeneratedValue
	private Integer contactId;

	private String contactName;

	private String contactEmail;

	private Long contactNumber;

}
