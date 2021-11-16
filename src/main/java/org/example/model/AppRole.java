package org.example.model;

public enum AppRole { //Enums are inherently Serializable
    ROLE_APP_USER("User"),
    ROLE_APP_ADMIN("Admin");


    private final String appRole;

    AppRole(String appRole) {
        this.appRole = appRole;
    }

    public String getAppRole() {
        return appRole;
    }
}
