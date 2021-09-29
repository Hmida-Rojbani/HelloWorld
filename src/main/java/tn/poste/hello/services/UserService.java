package tn.poste.hello.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.poste.hello.entities.UserEntity;
import tn.poste.hello.models.ui.User;
import tn.poste.hello.repositories.UserRepository;

@Service
@AllArgsConstructor
public class UserService {
	
	private UserRepository userRepos;
	private ModelMapper mapper;
	// save in Db
	public void saveUserToDb(User user) {
		
		UserEntity entity = mapper.map(user, UserEntity.class);
		userRepos.save(entity);
		System.out.println("User is Saved");
	}
	
	// select *
	public List<User> getUserList(){
		List<UserEntity> listEntites = userRepos.findAll();
		List<User> listUsers = new ArrayList<>();	
		for (UserEntity entity : listEntites) {
			listUsers.add(mapper.map(entity, User.class));
		}
		return listUsers;
	}
	

}
