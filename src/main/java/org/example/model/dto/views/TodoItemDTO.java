package org.example.model.dto.views;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.example.model.Person;

import java.time.LocalDate;

public class TodoItemDTO {

    private int id;
    private String title;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String taskDescription;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LocalDate deadline;
    private boolean done;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Person creator;


    public TodoItemDTO() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "TodoItemDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", deadline=" + deadline +
                ", done=" + done +
                ", creator=" + creator +
                '}';
    }
}
