package tn.poste.hello.services;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.poste.hello.entities.UserEntity;
import tn.poste.hello.models.ui.User;
import tn.poste.hello.repositories.UserRepository;

@Service
@AllArgsConstructor
public class UserService {
	
	private UserRepository userRepos;
	
	public void saveUserToDb(User user) {
		UserEntity entity = new UserEntity();
		entity.setFirstName(user.getFirstName());
		entity.setLastName(user.getLastName());
		entity.setDob(user.getDob());
		userRepos.save(entity);
		System.out.println("User is Saved");
	}

}
