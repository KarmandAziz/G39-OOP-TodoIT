package org.example.service;

import org.example.model.AppRole;
import org.example.model.Person;
import org.example.model.dto.forms.PersonForm;
import org.example.service.interfaces.PersonService;

import java.util.List;

public class PersonServiceImpl implements PersonService {





    @Override
    public Person create(PersonForm form) {
        return null;
    }

    @Override
    public Person findById(Integer id) {
        return null;
    }

    @Override
    public Person findByUsername(String username) {
        return null;
    }

    @Override
    public Person findByRole(AppRole role) {
        return null;
    }

    @Override
    public List<Person> findAll() {
        return null;
    }

    @Override
    public List<Person> findByName(String name) {
        return null;
    }

    @Override
    public Person update(String username, PersonForm form) {
        return null;
    }

    @Override
    public void delete() {

    }
}
