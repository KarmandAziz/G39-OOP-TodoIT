package org.example.model;

import java.util.Objects;

public class AppUser {
         //Field
    private String username;
    private String password;
    private AppRole ROLE_APP_USER;

         //constructor
    public AppUser(String username, String password, AppRole ROLE_APP_USER) {
        setUsername(username);
        setPassword(password);
        setROLE_APP_USER(ROLE_APP_USER);
    }

             //methods
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AppRole getROLE_APP_USER() {
        return ROLE_APP_USER;
    }

    public void setROLE_APP_USER(AppRole ROLE_APP_USER) {
        this.ROLE_APP_USER = ROLE_APP_USER;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(username, appUser.username) && ROLE_APP_USER == appUser.ROLE_APP_USER;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, ROLE_APP_USER);
    }
}
