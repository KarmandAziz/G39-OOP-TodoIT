package org.example.sequencers;

public class PersonIdSequencer {

    private static int currentId;

    public int nextId(){
        return ++currentId;
    }

    public int getCurrentId() {
        return currentId;
    }

    public void setCurrentId(int currentId) {
        PersonIdSequencer.currentId = currentId;
    }
}
