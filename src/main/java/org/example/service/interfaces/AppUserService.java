package org.example.service.interfaces;

import org.example.App;
import org.example.model.AppRole;
import org.example.model.AppUser;
import org.example.model.dto.forms.AppUserForm;

import java.util.List;

public interface AppUserService {

    AppUser create(AppUserForm form, AppRole role);
    AppUser findByUsername(String username);
    List<AppUser> findByRole(AppRole role);
    List<AppUser> findAll();
    AppUser update(String username, AppUserForm form);
    boolean delete(String username);


}
