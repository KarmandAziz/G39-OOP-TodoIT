package org.example.data;

import org.example.model.Person;

import java.util.Optional;

public interface PersonDAO extends GenericCrud<Person, Integer>{

    Optional<Person> findByEmail(String email);

}
