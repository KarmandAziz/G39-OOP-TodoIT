package org.example.model;

import java.io.Serializable;
import java.util.Objects;

public class AppUser implements Serializable {

    private String username;
    private String password;
    private AppRole role;


    public AppUser(String username, String password, AppRole role)throws RuntimeException {
        setUsername(username);
        setPassword(password);
        setRole(role);
    }

   AppUser(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if(username == null) throw new RuntimeException("Username is null");
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password == null) throw new RuntimeException("Password is null");
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if(role == null) throw new RuntimeException("role is null");
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(username, appUser.username) && role == appUser.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, role);
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "username: '" + username + '\'' +
                ", role: " + role +
                '}';
    }
}
