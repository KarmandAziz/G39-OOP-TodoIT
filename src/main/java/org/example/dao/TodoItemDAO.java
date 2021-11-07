package org.example.dao;


import com.sun.tools.javac.comp.Todo;
import org.example.model.Person;
import org.example.model.TodoItem;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;

public interface TodoItemDAO {

    TodoItem persist(TodoItem todoItem);
    TodoItem findByID(int id);
    Collection<TodoItem> findAll();
    Collection<TodoItem> findAllByDoneStatus(LocalDate done);
    Collection<TodoItem> findByTitleContains(String title);
    Collection<TodoItem> findByPersonId(int personid);
    Collection<TodoItem> findByDeadlineBefore(LocalDate date);
    Collection<TodoItem> findByDeadlineAfter(LocalDate date);
    void remove(int id);


}
