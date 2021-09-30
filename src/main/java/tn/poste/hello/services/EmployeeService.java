package tn.poste.hello.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.poste.hello.entities.Creator;
import tn.poste.hello.entities.Empolyee;
import tn.poste.hello.entities.Matricule;
import tn.poste.hello.entities.Project;
import tn.poste.hello.repositories.CreatorRepository;
import tn.poste.hello.repositories.EmpolyeeRepository;
import tn.poste.hello.repositories.MatriculeRepository;

@AllArgsConstructor
@Service
public class EmployeeService {
	
	private EmpolyeeRepository empRepos;
	private MatriculeRepository matRepos;
	private CreatorRepository creatorRepos;
	
	/// testing Relations
		public void testAddData() {
			// One To one
			Empolyee empolyee = new Empolyee();
			Matricule mat = new Matricule();
			Creator creator = new Creator();
			Project project = new Project();
			
			project.setName("new Project");
			project.setCode("P0001");
			project.setCreationDate(LocalDate.now());
			project.setEstimatedEndDate(LocalDate.now().plusMonths(3));
			
			creator.setName("Admin1");
			creatorRepos.save(creator);
			
			empolyee.setFirstName("John");
			empolyee.setLastName("Doe");
			empolyee.getProjects().add(project);
			
			
			
			mat.setCode("E0001");
			mat.setCreator(creator);
			//matRepos.save(mat);
			
			creator.getMatricules().add(mat);
			
			empolyee.setMatricule(mat);
			
			empRepos.save(empolyee);
			
			project.getEmpolyees().add(empolyee);
		}
		
		
		public void getAll(){
			empRepos.findAll()
				.stream()
				.forEach(System.out::println);
		}
		
		public void getAllCreator() {
			for (Creator creator : creatorRepos.findAll()) {
				System.out.println(creator);
				System.out.println("creator list of matricules :"+ creator.getMatricules());
			}
			
		}

}
