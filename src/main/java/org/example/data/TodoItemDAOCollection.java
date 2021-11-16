package org.example.data;

import org.example.data.interfaces.TodoItemDAO;
import org.example.model.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

public class TodoItemDAOCollection implements TodoItemDAO {


   private static final TodoItemDAOCollection INSTANCE;
   static {
       INSTANCE = new TodoItemDAOCollection(null);
   }
   public static TodoItemDAOCollection getInstance(){
       return INSTANCE;
   }

   static TodoItemDAOCollection getTestInstance(Collection<TodoItem> todoItems){
       return new TodoItemDAOCollection(todoItems);
   }

    private Collection<TodoItem> todoItemList;

    public TodoItemDAOCollection(Collection<TodoItem> todoItemList) {
        this.todoItemList =
                todoItemList == null ? new ArrayList<>() : new ArrayList<>(todoItemList);
        }

    @Override
    public TodoItem persist(TodoItem todoItem) {
        todoItemList.add(todoItem);
        return todoItem;
    }

    @Override
    public Collection<TodoItem> findAll() {
        return new ArrayList<>(todoItemList);
    }

    @Override
    public Optional<TodoItem> findByID(Integer ID) {
        return todoItemList.stream()
                .filter(todoItem -> todoItem.getId() == ID)
                .findFirst();
    }

    @Override
    public void remove(Integer ID) {
        Collection<TodoItem> toBeRemoved = todoItemList.stream()
                .filter(todoItem -> todoItem.getId() == ID)
                .collect(Collectors.toList());
        todoItemList.remove(toBeRemoved);
    }

    @Override
    public Collection<TodoItem> findAllByDoneStatus(LocalDate done) {
        return todoItemList.stream()
                .filter(TodoItem::isDone)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<TodoItem> findByTitleContains(String title) {
       return todoItemList.stream()
               .filter(todoItem -> todoItem.getTitle().contains(title))
               .collect(Collectors.toList());
    }

    @Override
    public Collection<TodoItem> findByPersonId(int personid) {
        return todoItemList.stream()
                .filter(todoItem -> todoItem.getCreator().equals(personid))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<TodoItem> findByDeadlineBefore(LocalDate date) {
        return todoItemList.stream()
                .filter(todoItem -> todoItem.getDeadline().isBefore(date))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter(LocalDate date) {
        return todoItemList.stream()
                .filter(todoItem -> todoItem.getDeadline().isAfter(date))
                .collect(Collectors.toList());
    }

}
