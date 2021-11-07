package org.example.dao;

import org.example.model.Person;
import org.example.sequencers.PersonIdSequencer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PersonDAOCollection implements PersonDAO {


    private List<Person> personStorage = new ArrayList<>();

    public PersonDAOCollection(List<Person> personStorage) {
        if(personStorage == null){
            this.personStorage = new ArrayList<>();
        }else{
            personStorage = personStorage;
        }
    }

    @Override
    public Person persist(Person person) {
        boolean added = personStorage.add(person);
        if(added){
            return person;
        }else{
            return null;
        }

    }


    @Override
    public Person findByID(int id) {
        for(Person person : personStorage){
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }

    @Override
    public Person findByEmail(String email) {
        for(Person person : personStorage){
            if(person.getEmail().equalsIgnoreCase(email)){
                return person;
            }
        }
        return null;
    }

    @Override
    public Collection<Person> findAll() {
        return new ArrayList<>(personStorage);
    }

    @Override
    public void remove(int id) {
        Person person = findByID(id);
        this.personStorage.remove(person);
    }
}
