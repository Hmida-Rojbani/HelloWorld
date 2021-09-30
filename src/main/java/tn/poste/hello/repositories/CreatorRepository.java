package tn.poste.hello.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.poste.hello.entities.Creator;

public interface CreatorRepository extends JpaRepository<Creator, Long>{

}
