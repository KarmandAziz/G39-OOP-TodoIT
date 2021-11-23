package org.example.model.dto.forms;

import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;
import java.time.LocalDate;

public class TodoItemForm implements Serializable {

    private int id;
    @NotBlank(message = "This field is mandatory")
    private String title;
    @NotBlank(message = "This field is mandatory")
    private String taskDescription;
    @NotBlank(message = "This field is mandatory")
    private LocalDate deadline;
    private boolean done;

    public TodoItemForm(){}


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
}
