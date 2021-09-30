package tn.poste.hello.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString(exclude = "empolyees")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String code;
	
	private LocalDate creationDate;
	private LocalDate estimatedEndDate;
	
	@ManyToMany(mappedBy = "projects")
	private List<Empolyee> empolyees = new ArrayList<>();

}
