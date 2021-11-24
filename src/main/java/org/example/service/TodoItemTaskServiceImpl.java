package org.example.service;

import org.example.data.interfaces.TodoItemTaskDAO;
import org.example.model.TodoItemTask;
import org.example.model.dto.forms.TodoItemTaskForm;
import org.example.service.interfaces.PersonService;
import org.example.service.interfaces.TodoItemService;
import org.example.service.interfaces.TodoItemTaskService;

import java.util.List;

public class TodoItemTaskServiceImpl implements TodoItemTaskService {

    private final TodoItemTaskDAO todoitemTaskDAO;
    private final PersonService personService;
    private final TodoItemService todoItemService;

    public TodoItemTaskServiceImpl(TodoItemTaskDAO todoitemTaskDAO, PersonService personService, TodoItemService todoItemService) {
        this.todoitemTaskDAO = todoitemTaskDAO;
        this.personService = personService;
        this.todoItemService = todoItemService;
    }

    @Override
    public TodoItemTask create(TodoItemTaskForm form) {
        return null;
    }

    @Override
    public TodoItemTask findById(Integer id) {
        return null;
    }

    @Override
    public List<TodoItemTask> findAll() {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
