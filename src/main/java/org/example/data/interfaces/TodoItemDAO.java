package org.example.data.interfaces;


import org.example.data.interfaces.GenericCrud;
import org.example.model.TodoItem;

import java.time.LocalDate;
import java.util.Collection;

public interface TodoItemDAO extends GenericCrud<TodoItem, Integer> {


    Collection<TodoItem> findAllByDoneStatus(LocalDate done);
    Collection<TodoItem> findByTitleContains(String title);
    Collection<TodoItem> findByPersonId(int personid);
    Collection<TodoItem> findByDeadlineBefore(LocalDate date);
    Collection<TodoItem> findByDeadlineAfter(LocalDate date);


}
