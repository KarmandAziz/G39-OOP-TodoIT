package org.example.model.dto.views;

import org.example.model.AppRole;

public class AppUserDTO {

    private String username;
    private AppRole role;

    public AppUserDTO(){}


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "AppUserDTO{" +
                "username='" + username + '\'' +
                ", role=" + role +
                '}';
    }
}
