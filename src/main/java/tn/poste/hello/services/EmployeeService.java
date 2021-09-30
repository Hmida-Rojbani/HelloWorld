package tn.poste.hello.services;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.poste.hello.entities.Empolyee;
import tn.poste.hello.entities.Matricule;
import tn.poste.hello.repositories.EmpolyeeRepository;
import tn.poste.hello.repositories.MatriculeRepository;

@AllArgsConstructor
@Service
public class EmployeeService {
	
	private EmpolyeeRepository empRepos;
	private MatriculeRepository matRepos;
	
	/// testing Relations
		public void testAddData() {
			// One To one
			Empolyee empolyee = new Empolyee();
			Matricule mat = new Matricule();
			
			empolyee.setFirstName("John");
			empolyee.setLastName("Doe");
			
			mat.setCode("E0001");
			mat.setNameOfCreator("Admin1");
			
			matRepos.save(mat);
			
			empolyee.setMatricule(mat);
			
			empRepos.save(empolyee);
		}
		
		
		public void getAll(){
			empRepos.findAll()
				.stream()
				.forEach(System.out::println);
		}

}
