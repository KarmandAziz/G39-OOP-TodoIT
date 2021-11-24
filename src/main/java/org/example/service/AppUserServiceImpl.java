package org.example.service;

import org.example.data.interfaces.AppUserDAO;
import org.example.model.AppRole;
import org.example.model.AppUser;
import org.example.model.dto.forms.AppUserForm;
import org.example.service.interfaces.AppUserService;

import java.util.List;

public class AppUserServiceImpl implements AppUserService {

    private final AppUserDAO userDAO;

    public AppUserServiceImpl(AppUserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public AppUser create(AppUserForm form, AppRole role) {
        return null;
    }

    @Override
    public AppUser findByUsername(String username) {
        return null;
    }

    @Override
    public List<AppUser> findByRole(AppRole role) {
        return null;
    }

    @Override
    public List<AppUser> findAll() {
        return null;
    }

    @Override
    public AppUser update(String username, AppUserForm form) {
        return null;
    }

    @Override
    public boolean delete(String username) {
        return false;
    }
}
