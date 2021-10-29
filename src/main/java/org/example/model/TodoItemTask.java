package org.example.model;

import org.example.model.Person;
import org.example.model.TodoItem;

public class TodoItemTask {
        // Fields
       private int id;
       private boolean assigned;
       private TodoItem todoItem;
       private Person assignee;

        //constructor
        public TodoItemTask(int id,
                            boolean assigned,
                            TodoItem todoItem,
                            Person assignee) {
            if(id == 0) throw new RuntimeException("Id is 0");
            this.id = id;
            setAssigned(assigned);
            setTodoItem(todoItem);
            setAssignee(assignee);
        }

           // getters and setters

    public int getId() {
        return id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public Object setAssigned(boolean assigned) {
            if(assignee != null){
                assigned = true;
            }
            this.assigned = assigned;
        return null;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) throws RuntimeException {
        if(todoItem == null) throw new RuntimeException("Name is null");
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) throws RuntimeException {
        if(assignee == null) throw new RuntimeException("Name is null");
        this.assignee = assignee;
    }

    public String getSummary() {
        if(assigned)
            return "Id: " + id + "\n"
                + "Assigned status: " + true + "\n"
                + "To do: " + todoItem.getTaskDescription() + "\n"
                + "Person: " +assignee.getSummary();
        else return id + " is not assigned";

    }






    }



