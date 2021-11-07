package org.example.sequencers;

public class TodoItemSequencer {

    private static int currentId;

    public int nextId(){
        return ++currentId;
    }

    public int getCurrentId() {
        return currentId;
    }

    public void setCurrentId(int currentId) {
        TodoItemSequencer.currentId = currentId;
    }
}
