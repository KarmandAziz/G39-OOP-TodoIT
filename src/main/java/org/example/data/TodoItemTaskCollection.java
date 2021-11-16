package org.example.data;

import org.example.data.interfaces.TodoItemTaskDAO;
import org.example.model.TodoItemTask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

public class TodoItemTaskCollection implements TodoItemTaskDAO {

   private static final TodoItemTaskCollection INSTANCE;
   static {
       INSTANCE = new TodoItemTaskCollection(null);
    }

    public static TodoItemTaskCollection getInstance(){
        return INSTANCE;
    }

    private TodoItemTaskCollection(Collection<TodoItemTask> todoItemTasksList) {
       this.todoItemTasksList =
               todoItemTasksList
                       == null ? new ArrayList<>() : new ArrayList<>(todoItemTasksList);
    }

    private Collection<TodoItemTask> todoItemTasksList;

    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
       todoItemTasksList.add(todoItemTask);
       return todoItemTask;
    }

    @Override
    public Collection<TodoItemTask> findAll() {
        return new ArrayList<>(todoItemTasksList);
    }

    @Override
    public Optional<TodoItemTask> findByID(Integer ID) {
        return todoItemTasksList.stream()
                .filter(todoItemTask -> todoItemTask.getId() == ID)
                .findFirst();
    }

    @Override
    public void remove(Integer ID) {
        Collection<TodoItemTask> taskToRemove = todoItemTasksList.stream()
                .filter(todoItemTask -> todoItemTask.getId() == ID)
                .collect(Collectors.toList());

        todoItemTasksList.remove(taskToRemove);
    }


    @Override
    public Collection<TodoItemTask> findByAssignedStatus(Boolean status) {
        return todoItemTasksList.stream()
                .filter(todoItemTask -> todoItemTask.isAssigned() == status)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<TodoItemTask> findByPersonId(int personId) {
        return todoItemTasksList.stream()
                .filter(todoItemTask -> todoItemTask.getAssignee().equals(personId))
                .collect(Collectors.toList());
    }

}
