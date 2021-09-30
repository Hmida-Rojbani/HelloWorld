package tn.poste.hello.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.poste.hello.entities.Matricule;

public interface MatriculeRepository extends JpaRepository<Matricule, Long> {

}
