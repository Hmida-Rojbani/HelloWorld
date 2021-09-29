package tn.poste.hello.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import tn.poste.hello.models.ui.Profession;

@Entity
@Table(name = "User")
@Data
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 50, nullable = false)
	private String firstName;
	@Column(length = 50, nullable = false)
	private String lastName;
	@Column(name = "DateOfBirth")
	private LocalDate dob;
	private String address;
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private Profession profession;

}
