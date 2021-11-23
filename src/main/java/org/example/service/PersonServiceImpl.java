package org.example.service;

import org.example.data.interfaces.AppUserDAO;
import org.example.data.interfaces.PersonDAO;
import org.example.data.interfaces.TodoItemDAO;
import org.example.model.AppRole;
import org.example.model.AppUser;
import org.example.model.Person;
import org.example.model.TodoItem;
import org.example.model.dto.forms.AppUserForm;
import org.example.model.dto.forms.PersonForm;
import org.example.service.interfaces.PersonService;

import java.util.List;

public class PersonServiceImpl implements PersonService {

    private final PersonDAO personDAO;
    private final TodoItemDAO todoItemDAO;
    private final AppUserDAO credentials;

    public PersonServiceImpl(PersonDAO personDAO, TodoItemDAO todoItemDAO, AppUserDAO credentials) {
        this.personDAO = personDAO;
        this.todoItemDAO = todoItemDAO;
        this.credentials = credentials;
    }

    @Override
    public Person create(PersonForm form) {
        if(form == null) throw new IllegalAccessException("form was null");
        if(form.getCredentials() == null) throw new IllegalAccessException("form.credentials was null");

        FormValidator formValidator = FormValidator.getInstance();
        formValidator.validate(form.getCredentials(), AppUser.class);

        return form;
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
