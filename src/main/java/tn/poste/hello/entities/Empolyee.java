package tn.poste.hello.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Empolyee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	private Matricule matricule;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Project> projects = new ArrayList<>();

}
