package tn.poste.hello.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString(exclude = "empolyee")
public class Matricule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String code;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Creator creator;
	
	@OneToOne(mappedBy = "matricule", fetch = FetchType.LAZY)
	private Empolyee empolyee;

}
