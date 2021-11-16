package org.example.data;

import org.example.data.interfaces.PersonDAO;
import org.example.model.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonDAOCollection implements PersonDAO {

    private static final PersonDAOCollection INSTANCE;

    static {
        INSTANCE = new PersonDAOCollection(null);
    }

    static PersonDAOCollection getTestInstance(List<Person> person){
        return new PersonDAOCollection(person);
    }

    public static PersonDAOCollection getInstance(){
        return INSTANCE;
   }

   private PersonDAOCollection(Collection<Person> personCollection){
        this.personStorage =
                personCollection == null ? new ArrayList<>() : new ArrayList<>(personCollection);
   }


    private final List<Person> personStorage;

    @Override
    public Person persist(Person person) {
        personStorage.add(person);
        return person;
    }

    @Override
    public List<Person> findAll() {
        return new ArrayList<>(personStorage);
    }

    @Override
    public Optional<Person> findByID(Integer Id) {
        return personStorage.stream()
                .filter(person -> person.getId() == Id)
                .findFirst();
    }

    @Override
    public void remove(Integer Id) {
      List<Person> personToRemove = personStorage.stream()
                      .filter(person -> person.getId() == Id)
                              .collect(Collectors.toList());
      personStorage.remove(personToRemove);
    }

    @Override
    public Optional<Person> findByEmail(String email) {
        return personStorage.stream()
                .filter(person -> person.getEmail().equalsIgnoreCase(email))
                .findFirst();
    }
}
