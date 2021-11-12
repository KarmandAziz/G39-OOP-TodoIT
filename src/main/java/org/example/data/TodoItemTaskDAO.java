package org.example.data;

import org.example.model.TodoItemTask;

import java.util.Collection;

public interface TodoItemTaskDAO extends GenericCrud<TodoItemTask, Integer>{

    Collection<TodoItemTask> findByAssignedStatus(Boolean status);
    Collection<TodoItemTask> findByPersonId(int personId);

}
