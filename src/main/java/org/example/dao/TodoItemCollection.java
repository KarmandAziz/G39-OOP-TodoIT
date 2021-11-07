package org.example.dao;

import com.sun.tools.javac.comp.Todo;
import org.example.model.Person;
import org.example.model.TodoItem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TodoItemCollection implements TodoItemDAO{

    private Collection<TodoItem> todoItemList = new ArrayList<>();

    public TodoItemCollection(Collection<TodoItem> todoItemList) {
        if(todoItemList == null){
            this.todoItemList = new ArrayList<>();
        }else{
            todoItemList = todoItemList;
        }
    }

    @Override
    public TodoItem persist(TodoItem todoItem) {
        boolean added = todoItemList.add(todoItem);
        if(added){
            return todoItem;
        }else{
            return null;
        }
    }

    @Override
    public TodoItem findByID(int id) {
        for(TodoItem item : todoItemList){
            if(item.getId() == id){
                return item;
            }
        }
        return null;
    }

    @Override
    public Collection<TodoItem> findAll() {
        return new ArrayList<>(todoItemList);
    }

    @Override
    public Collection<TodoItem> findAllByDoneStatus(boolean done) {
        return null;
    }

    @Override
    public Collection<TodoItem> findByTitleContains(String title) {
        return null;
    }

    @Override
    public Collection<TodoItem> findByPersonId(Person personid) {
        return null;
    }

    @Override
    public Collection<TodoItem> findByDeadlineBefore(Date date) {
        return null;
    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter(Date date) {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
