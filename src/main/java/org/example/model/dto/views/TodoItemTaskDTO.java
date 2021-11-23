package org.example.model.dto.views;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.example.model.Person;
import org.example.model.TodoItem;
import org.example.model.TodoItemTask;

public class TodoItemTaskDTO {

    private int id;
    private boolean assigned;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private TodoItem todoItem;
    private Person assignee;



    public TodoItemTaskDTO(){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    @Override
    public String toString() {
        return "TodoItemTaskDTO{" +
                "id=" + id +
                ", assigned=" + assigned +
                ", todoItem=" + todoItem +
                ", assignee=" + assignee +
                '}';
    }
}
