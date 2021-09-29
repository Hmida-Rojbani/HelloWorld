package tn.poste.hello.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tn.poste.hello.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

	@Query("select u from UserEntity u where u.dob > '2000-01-01'")
	public List<UserEntity> getUsersAgeMin20();
	
	Optional<UserEntity> findByLastName(String lastName);
}
