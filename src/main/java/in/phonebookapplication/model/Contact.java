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
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer contactId;

	@Column(name = "Contact_Name")
	private String contactName;

	@Column(name = "Contact_Email")
	private String contactEmail;

	@Column(name = "Contact_Number")
	private Long contactNumber;

}
