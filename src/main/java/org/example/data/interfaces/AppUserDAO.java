package org.example.data.interfaces;

import org.example.model.AppUser;

import java.util.List;

public interface AppUserDAO extends GenericCrud<AppUser, String> {
    void remove(String username);
    List<AppUser> findByUsername(String username);


}
