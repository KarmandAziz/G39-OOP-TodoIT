package org.example.service.interfaces;

import com.sun.tools.javac.comp.Todo;
import org.example.model.TodoItem;
import org.example.model.dto.forms.TodoItemForm;

import java.util.List;

public interface TodoItemService {

    TodoItem create(TodoItemForm form);
    TodoItem findById(Integer id);
    List<TodoItem> findAll();
    List<TodoItem> findByTitle(String title);
    List<TodoItem> findByTaskDescription(String taskDescription);
    TodoItem update(Integer id, TodoItemForm todoItemForm);
    boolean delete(Integer id);


}
