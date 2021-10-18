package org.example;

public class Person {
           //Fields
      private int id;
      private String firstName;
      private String lastName;
      private String email;



       // Constructor
    public Person(int id,
                  String firstName,
                  String lastName,
                  String email){
        this.id = id;      // THIS MEANS THIS OBJECT
        this.firstName = firstName;
        this. lastName = lastName;
        this.email = email;
    }

       //getters and setters

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSummary(){
        return "Name: "+firstName +" "+ lastName + "\n" + "Email: " + email;
    }


}
