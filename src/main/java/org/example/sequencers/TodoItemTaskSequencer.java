package org.example.sequencers;

public class TodoItemTaskSequencer {

    private int currentId;


    public int nextId(){
        return currentId++;
    }


    public int getCurrentId() {
        return currentId;
    }

    public void setCurrentId(int currentId) {
        this.currentId = currentId;
    }
}
