package tn.poste.hello.models.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class User {
	
	private Long id;
	@NotBlank(message = "Field First name must not be empty")
	@Size(max = 50, min = 5, message = "Number of characters allowed is between 5 and 50")
	private String firstName;
	@NotBlank(message = "Field Last name must not be empty")
	@Size(max = 50, min = 5, message = "Number of characters allowed is between 5 and 50")
	private String lastName;
	@Past(message = "Give a date in the past")
	private LocalDate dob = LocalDate.now();
	private String dobHtml;
	private String address;
	private Profession profession;

	public void setDobHtml(String dobHtml) {
		this.dobHtml = dobHtml;
		this.dob = LocalDate.parse(dobHtml);
	}
	

	public String getDobHtml() {
		if(dobHtml==null)
			dobHtml = this.dob.format(DateTimeFormatter.ISO_LOCAL_DATE);

			return dobHtml;
	}
	
	
	
}
