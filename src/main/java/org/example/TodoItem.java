package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.UUID;

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
                    Person creator)
    {
        this.id = id;
        setTitle(title);
        setTaskDescription(taskDescription);
        setDeadline(deadline);
        this.done = done;
        setCreator(creator);
    }


    //getters and setters
    public int getId() {
        return id;
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
        return done;
    }

    public Person getCreator() {
        return creator;
    }


    public void setCreator(Person creator) throws RuntimeException{
        if(creator == null) throw new RuntimeException();
        this.creator = creator;
    }
    public String getSummary(){
        return "Title: "+title +"\n" +
                "Task: " + taskDescription + "\n"
                + "Deadline :" + deadline + "\n"
                + "Finished :" + done + "\n"  +
                "Creator : " + creator.getSummary();
    }


}
