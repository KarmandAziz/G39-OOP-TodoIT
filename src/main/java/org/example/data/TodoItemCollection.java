package org.example.data;

import org.example.model.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

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
    public Collection<TodoItem> findAll() {
        return new ArrayList<>(todoItemList);
    }

    @Override
    public Optional<TodoItem> findByID(Integer integer) {
        return Optional.empty();
    }

    @Override
    public void remove(Integer integer) {

    }

    @Override
    public Collection<TodoItem> findAllByDoneStatus(LocalDate done) {
        Collection<TodoItem> finished = new ArrayList<>();
        for(TodoItem item : todoItemList){
            if(item.isDone()){
                finished.add(item);
            }
        }
        return finished;
    }

    @Override
    public Collection<TodoItem> findByTitleContains(String title) {
       Collection<TodoItem> found = new ArrayList<>();
       for(TodoItem item : todoItemList){
           if(item.getTitle().toLowerCase().contains(title.toLowerCase())){
               found.add(item);
           }
       }
        return found;
    }

    @Override
    public Collection<TodoItem> findByPersonId(int personid) {
        Collection<TodoItem> found = new ArrayList<>();
        for(TodoItem item : todoItemList){
            if(item.getId() == personid){
                found.add(item);
            }
        }
        return found;
    }

    @Override
    public Collection<TodoItem> findByDeadlineBefore(LocalDate date) {
        Collection<TodoItem> deadlineBeforeList = new ArrayList<>();
        for(TodoItem item : todoItemList){
            if(item.getDeadline().isBefore(date)){
                deadlineBeforeList.add(item);
            }
        }
        return deadlineBeforeList;
    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter(LocalDate date) {
        Collection<TodoItem> deadlineAfterList = new ArrayList<>();
        for(TodoItem item : todoItemList){
            if(item.getDeadline().isAfter(date)){
                deadlineAfterList.add(item);
            }
        }
        return deadlineAfterList;
    }


}
