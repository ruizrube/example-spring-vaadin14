package es.uca.iw.data.service;

import es.uca.iw.data.entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}