package one.digitalinnovation.personapi.repository;

import one.digitalinnovation.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    //JpaRepository<Person, Data type of PK>
    //This interface already implements the database operations so it is
    //not needed to write code to open or close connection, insert, etc
}
