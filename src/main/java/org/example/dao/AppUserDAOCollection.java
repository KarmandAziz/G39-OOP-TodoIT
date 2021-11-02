package org.example.dao;

import org.example.App;
import org.example.model.AppUser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AppUserDAOCollection implements AppUserDAO{

    private static final AppUserDAOCollection INSTANCE;
    static{ INSTANCE = new AppUserDAOCollection(null); }

    public static AppUserDAOCollection getInstance(){
        return INSTANCE;
    }

    static AppUserDAOCollection getTestInstance(List<AppUser> appUsers){
        return new AppUserDAOCollection(appUsers);
    }

    private List<AppUser> appUsersStorage = new ArrayList<>();

    public AppUserDAOCollection(List<AppUser> appUsersStorage) {
        if(appUsersStorage == null){
            this.appUsersStorage = new ArrayList<>();
        }else{
            appUsersStorage = appUsersStorage;
        }
    }

    @Override
    public AppUser persist(AppUser appUser) {
      boolean added = appUsersStorage.add(appUser);
        if(added){
            return appUser;
        }else{
            return null;
        }
    }

    @Override
    public AppUser findByUsername(String username) {
        for(AppUser user : appUsersStorage){
            if(user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }

    @Override
    public Collection<AppUser> findAll() {
        return appUsersStorage;
        }


    @Override
    public void remove(String username) {
        AppUser user = findByUsername(username);
    this.appUsersStorage.remove(user);
    }
}
