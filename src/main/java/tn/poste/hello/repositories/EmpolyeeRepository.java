package tn.poste.hello.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.poste.hello.entities.Empolyee;

public interface EmpolyeeRepository extends JpaRepository<Empolyee, Long> {

}
