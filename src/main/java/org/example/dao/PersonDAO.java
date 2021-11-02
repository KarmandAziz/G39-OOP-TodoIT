package org.example.dao;

import org.example.model.Person;

import java.util.Collection;

public interface PersonDAO {

    Person persist(String person);
    Person findByID(int id);
    Person findByEmail(String email);
    Collection<Person> findAll();
    void remove(int id);


}
