package org.example.dao;


import com.sun.tools.javac.comp.Todo;
import org.example.model.Person;
import org.example.model.TodoItem;

import java.util.Collection;
import java.util.Date;

public interface TodoItemDAO {

    TodoItem persist(TodoItem todoItem);
    TodoItem findByID(int id);
    Collection<TodoItem> findAll();
    Collection<TodoItem> findAllByDoneStatus(boolean done);
    Collection<TodoItem> findByTitleContains(String title);
    Collection<TodoItem> findByPersonId(Person personid);
    Collection<TodoItem> findByDeadlineBefore(Date date);
    Collection<TodoItem> findByDeadlineAfter(Date date);
    void remove(int id);


}
