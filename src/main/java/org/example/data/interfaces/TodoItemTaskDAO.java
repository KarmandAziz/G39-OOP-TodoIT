package org.example.data.interfaces;

import org.example.data.interfaces.GenericCrud;
import org.example.model.TodoItemTask;

import java.util.Collection;

public interface TodoItemTaskDAO extends GenericCrud<TodoItemTask, Integer> {

    Collection<TodoItemTask> findByAssignedStatus(Boolean status);
    Collection<TodoItemTask> findByPersonId(int personId);

}
