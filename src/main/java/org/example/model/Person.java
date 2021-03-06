package org.example.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {


      private int id;
      private String firstName;
      private String lastName;
      private String email;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
      private AppUser credentials;

    public Person(int id, String firstName, String lastName, String email, AppUser credentials)throws RuntimeException {
        if(id == 0) throw new RuntimeException("Id is 0");
        this.id = id;
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setCredentials(credentials);
    }

    Person(){}

    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws RuntimeException{
        if(firstName == null) throw new RuntimeException("FirstName is null");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws RuntimeException{
        if(lastName == null) throw new RuntimeException("LastName is null");
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws RuntimeException {
        if(email == null) throw new RuntimeException("Email is null");
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id: " + id +
                ", firstName: '" + firstName + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", email: '" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email);
    }
}
