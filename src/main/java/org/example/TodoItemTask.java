package org.example;

import java.time.LocalDate;

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
            this.id = id;
            this.assigned = assigned;
            this.todoItem = todoItem;
            this.assignee = assignee;
        }

           // getters and setters

            public int getId() {
        return id;
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

    public String getSummary() {
        return "Id: " + id + "\n"
                + "Assigned status: " + assigned + "\n"
                + "To do :" + todoItem + "\n"
                + "Person :" + assignee;

    }






    }


}
