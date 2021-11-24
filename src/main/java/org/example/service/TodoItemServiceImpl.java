package org.example.service;

import org.example.data.interfaces.TodoItemDAO;
import org.example.data.interfaces.TodoItemTaskDAO;
import org.example.model.TodoItem;
import org.example.model.dto.forms.TodoItemForm;
import org.example.service.interfaces.PersonService;
import org.example.service.interfaces.TodoItemService;

import java.util.List;

public class TodoItemServiceImpl implements TodoItemService {

    private final TodoItemDAO todoitemDAO;
    private final PersonService personService;
    private final TodoItemTaskDAO todoItemTaskDAO;

    public TodoItemServiceImpl(TodoItemDAO todoitemDAO, PersonService personService, TodoItemTaskDAO todoItemTaskDAO) {
        this.todoitemDAO = todoitemDAO;
        this.personService = personService;
        this.todoItemTaskDAO = todoItemTaskDAO;
    }


    @Override
    public TodoItem create(TodoItemForm form) {
        return null;
    }

    @Override
    public TodoItem findById(Integer id) {
        return null;
    }

    @Override
    public List<TodoItem> findAll() {
        return null;
    }

    @Override
    public List<TodoItem> findByTitle(String title) {
        return null;
    }

    @Override
    public List<TodoItem> findByTaskDescription(String taskDescription) {
        return null;
    }

    @Override
    public TodoItem update(Integer id, TodoItemForm todoItemForm) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
