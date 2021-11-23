package org.example.service.interfaces;

import org.example.model.AppRole;
import org.example.model.Person;
import org.example.model.dto.forms.PersonForm;

import java.util.List;

public interface PersonService {

    Person create(PersonForm form);
    Person findById(Integer id);
    Person findByUsername(String username);
    Person findByRole(AppRole role);
    List<Person> findAll();
    List<Person> findByName(String name);
    Person update (String username, PersonForm form);
    void delete();
}
