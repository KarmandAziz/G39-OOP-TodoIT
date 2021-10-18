package org.example;

import java.time.LocalDate;

public class TodoItem {
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
                    Person creator){
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadline = deadline;
        this.done = done;
        this.creator = creator;
    }


    //getters and setters
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

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }
    public String getSummary(){
        return "Title: "+title +"\n " +
                ""+ "Task: " + taskDescription + "\n"
                + "Deadline :" + deadline + "\n"
                + "Finished :" + done + "\n"  +
                "Creator : " + creator;
    }
    public boolean isOverdue(){
       if(deadline<done)
    }

}
