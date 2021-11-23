package org.example.service.interfaces;

import org.example.model.TodoItemTask;
import org.example.model.dto.forms.TodoItemTaskForm;

import java.util.List;

public interface TodoItemTaskService {

    TodoItemTask create(TodoItemTaskForm form);
    TodoItemTask findById(Integer id);
    List<TodoItemTask> findAll();
    boolean delete(Integer id);


}
