package org.example.model.dto.views;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.example.model.AppUser;

public class PersonDTO {

    private int id;
    private String firstName;
    private String lastname;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String email;
    private AppUser credentials;

    public PersonDTO(){}

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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", credentials=" + credentials +
                '}';
    }
}
