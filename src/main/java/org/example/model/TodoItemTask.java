package org.example.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.example.model.Person;
import org.example.model.TodoItem;

import java.io.Serializable;
import java.util.Objects;

public class TodoItemTask implements Serializable {

    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Person assignee;




        public TodoItemTask(int id,
                            boolean assigned,
                            TodoItem todoItem,
                            Person assignee)throws RuntimeException {
            if(id == 0) throw new RuntimeException("Id is 0");
            this.id = id;
            setAssigned(assigned);
            setTodoItem(todoItem);
            setAssignee(assignee);
        }

        TodoItemTask(){}



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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItemTask that = (TodoItemTask) o;
        return id == that.id && assigned == that.assigned && Objects.equals(todoItem, that.todoItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, assigned, todoItem);
    }

    @Override
    public String toString() {
        return "TodoItemTask{" +
                "id: " + id +
                ", assigned: " + assigned +
                ", todoItem: " + todoItem +
                '}';
    }
}



