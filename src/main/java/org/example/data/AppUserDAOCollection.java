package org.example.data;

import org.example.model.AppUser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AppUserDAOCollection implements AppUserDAO{


    private static final AppUserDAOCollection INSTANCE;
    static {
        INSTANCE = new AppUserDAOCollection(null);
    }

    public static AppUserDAOCollection getInstance(){
        return INSTANCE;
    }

    static AppUserDAOCollection getTestInstance(List<AppUser> appUsers){
        return new  AppUserDAOCollection(appUsers);
    }

    private Collection<AppUser> appUsersStorage;

    public AppUserDAOCollection(List<AppUser> appUsersStorage) {
        this.appUsersStorage =
                appUsersStorage == null ? new ArrayList<>() : new ArrayList<>(appUsersStorage);
    }

    @Override
    public AppUser persist(AppUser appUser) {
     appUsersStorage.add(appUser);
     return appUser;
    }

    @Override
    public List<AppUser> findByUsername(String username) {
        return appUsersStorage.stream()
                .filter(appUser -> appUser.getUsername().equalsIgnoreCase(username))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<AppUser> findAll() {
        return new ArrayList<>(appUsersStorage);
        }

    @Override
    public Optional<AppUser> findByID(String s) {
        return Optional.empty();
    }


    @Override
    public void remove(String username) {
        Collection<AppUser> toBeRemoved = appUsersStorage.stream()
                .filter(appUser -> appUser.getUsername().equalsIgnoreCase(username))
                .collect(Collectors.toList());
        appUsersStorage.remove(toBeRemoved);
    }









}
