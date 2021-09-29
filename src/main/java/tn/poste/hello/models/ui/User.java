package tn.poste.hello.models.ui;

import java.time.LocalDate;

import lombok.Data;

@Data
public class User {
	
	private Long id;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private String address;
	private Profession profession;

	public void setDob(String dob) {
		this.dob = LocalDate.parse(dob);
	}
	

	
	
	
}
