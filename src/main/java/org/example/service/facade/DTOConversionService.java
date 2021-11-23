package org.example.service.facade;

import org.example.model.AppUser;
import org.example.model.Person;
import org.example.model.TodoItem;
import org.example.model.TodoItemTask;
import org.example.model.dto.views.AppUserDTO;
import org.example.model.dto.views.PersonDTO;

import java.util.List;

public interface DTOConversionService {
    AppUserDTO toFullDTO(AppUser appUser);
    PersonDTO toFullDTO(Person person, List<TodoItemTask> todoItemTasks);
    PersonDTO toMiniDTO(Person person);
    TodoItem toFullDTO(TodoItem todoItem, List<TodoItemTask> todoItemTasks);
    TodoItem toMiniDTO(TodoItem todoItem);
    TodoItemTask toFullDTO(TodoItemTask todoItemTask);
    TodoItemTask toMiniDTO(TodoItemTask todoItemTask);


}
