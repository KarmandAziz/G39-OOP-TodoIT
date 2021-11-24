package org.example.service.facade;

import org.example.model.AppUser;
import org.example.model.Person;
import org.example.model.TodoItem;
import org.example.model.TodoItemTask;
import org.example.model.dto.views.AppUserDTO;
import org.example.model.dto.views.PersonDTO;

import java.util.List;

public class DTOConversionServiceImpl implements DTOConversionService{

    @Override
    public AppUserDTO toFullDTO(AppUser appUser) {
       if(appUser == null) return null;

       AppUserDTO dto = new AppUserDTO();
       dto.setUsername(appUser.getUsername());
       dto.setRole(appUser.getRole());

        return dto;
    }

    @Override
    public PersonDTO toFullDTO(Person person, List<TodoItemTask> todoItemTasks) {
        PersonDTO personDTO = null;
        if(person != null){
            personDTO = toMiniDTO(person);
            personDTO.s


        }


        return null;
    }

    @Override
    public PersonDTO toMiniDTO(Person person) {
        PersonDTO personDTO = null;
        if(person != null){
            personDTO = new PersonDTO();
            personDTO.setId(person.getId());
            personDTO.setFirstName(person.getFirstName());
            personDTO.setLastname(person.getLastName());
            personDTO.setEmail(person.getEmail());
            personDTO.setCredentials(person.getCredentials());
        }
        return personDTO;
    }

    @Override
    public TodoItem toFullDTO(TodoItem todoItem, List<TodoItemTask> todoItemTasks) {
        return null;
    }

    @Override
    public TodoItem toMiniDTO(TodoItem todoItem) {
        return null;
    }

    @Override
    public TodoItemTask toFullDTO(TodoItemTask todoItemTask) {
        return null;
    }

    @Override
    public TodoItemTask toMiniDTO(TodoItemTask todoItemTask) {
        return null;
    }
}
