package org.example.dao;

import com.sun.tools.javac.comp.Todo;
import org.example.model.TodoItem;
import org.example.model.TodoItemTask;

import java.util.Collection;

public interface TodoItemTaskDAO {

    TodoItemTask persist (TodoItemTask todoItemTask);
    TodoItemTask findById (int id);
    Collection<TodoItemTask> findAll();
    Collection<TodoItemTask> findByAssignedStatus(Boolean status);
    Collection<TodoItemTask> findByPersonId(int personId);
    void remove(int id);

}
