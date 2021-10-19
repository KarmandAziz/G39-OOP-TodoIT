package org.example;

import java.util.UUID;

public class Person {
           //Fields
      private int id;
      private String firstName;
      private String lastName;
      private String email;



       // Constructor
    public Person(
            int id,
            String firstName,
            String lastName,
            String email){
        this.id = id;
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }


//getters and setters

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

    public String getSummary(){
        return   "Id :" + id + "\n" +"Name: "+firstName +" "+ lastName + "\n" + "Email: " + email;
    }


}
