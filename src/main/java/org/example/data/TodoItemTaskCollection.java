package org.example.data;

import org.example.model.TodoItemTask;

import java.util.ArrayList;
import java.util.Collection;

public class TodoItemTaskCollection implements TodoItemTaskDAO {

    private Collection<TodoItemTask> todoItemTasksList = new ArrayList<>();

    public TodoItemTaskCollection(Collection<TodoItemTask> todoItemTasksList) {
        if(todoItemTasksList == null){
            this.todoItemTasksList = new ArrayList<>();
        }else{
            todoItemTasksList = todoItemTasksList;
        }
    }

    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        boolean added = todoItemTasksList.add(todoItemTask);
        if(added){
            return todoItemTask;
        }else{
            return null;
        }
    }

    @Override
    public TodoItemTask findById(int id) {
        for(TodoItemTask todoItemTask : todoItemTasksList){
            if(todoItemTask.getId() == id){
                return todoItemTask;
            }
        }
        return null;
    }

    @Override
    public Collection<TodoItemTask> findAll() {
        return new ArrayList<>(todoItemTasksList);
    }

    @Override
    public Collection<TodoItemTask> findByAssignedStatus(Boolean status) {
        Collection<TodoItemTask> statusList = new ArrayList<>();
        for(TodoItemTask task : todoItemTasksList){
            if(task.isAssigned()){
                statusList.add(task);
            }
        }
        return statusList;
    }

    @Override
    public Collection<TodoItemTask> findByPersonId(int personId) {
        Collection<TodoItemTask> person = new ArrayList<>();
        for(TodoItemTask person1 : todoItemTasksList){
            if (person1.getId() == personId){
                person.add(person1);
            }
        }
        return person;
    }

    @Override
    public void remove(int id) {
        TodoItemTask task = findById(id);
        this.todoItemTasksList.remove(task);

    }
}
