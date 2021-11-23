package org.example.model.dto.forms;

import org.example.model.AppUser;
import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;

public class PersonForm implements Serializable {

    private int id;
    @NotBlank(message = "This field is mandatory")
    private String firstName;
    @NotBlank(message = "This field is mandatory")
    private String lastName;
    @NotBlank(message = "This field is mandatory")
    private String email;
    private AppUser credentials;

    public PersonForm(){}


    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
