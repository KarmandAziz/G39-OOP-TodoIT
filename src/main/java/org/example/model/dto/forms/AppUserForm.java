package org.example.model.dto.forms;

import jakarta.validation.constraints.NotBlank;
import org.example.model.AppRole;

public class AppUserForm {

    @NotBlank(message = "This field is mandatory")
    private String username;
    @NotBlank(message = "This field is mandatory")
    private String password;
    private AppRole role;

    public AppUserForm(){}

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

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        this.role = role;
    }
}
