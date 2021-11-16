package org.example.model;

import org.example.model.Person;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class TodoItem implements Serializable {
       //fields
    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadline;
    private boolean done;
    private Person creator;



    // Construction


    public TodoItem(int id,
                    String title,
                    String taskDescription,
                    LocalDate deadline,
                    boolean done,
                    Person creator)throws RuntimeException
    {
        if(id == 0) throw new RuntimeException("Id is 0");
        this.id = id;
        setTitle(title);
        setTaskDescription(taskDescription);
        setDeadline(deadline);
        setDone(done);
        setCreator(creator);
    }

    TodoItem(){}



    //getters and setters
    public int getId() {
        return id;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws RuntimeException{
        if(title == null) throw new RuntimeException("Title is null");
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) throws RuntimeException{
        if(taskDescription == null) throw new RuntimeException("Description is null");
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) throws RuntimeException{
        if(deadline == null) throw new RuntimeException("Deadline is null");
        this.deadline = deadline;

    }

    public boolean isDone() {
        if(LocalDate.now().isBefore(deadline)){
            return true;
        }
            return done;

    }


    public Person getCreator() {
        return creator;
    }

    public boolean isOverdue(){
        return LocalDate.now().isAfter(deadline);

        }

    public void setCreator(Person creator) throws RuntimeException{
        if(creator == null) throw new RuntimeException();
        this.creator = creator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return id == todoItem.id && done == todoItem.done && Objects.equals(title, todoItem.title) && Objects.equals(taskDescription, todoItem.taskDescription) && Objects.equals(deadline, todoItem.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, taskDescription, deadline, done);
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", deadline=" + deadline +
                ", done=" + done +
                '}';
    }
}
