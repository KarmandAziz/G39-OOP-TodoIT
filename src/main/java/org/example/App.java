package org.example;

import org.example.model.AppRole;
import org.example.model.AppUser;
import org.example.model.Person;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {


        AppUser user = new AppUser("Karmand94", "!arnE123", AppRole.ROLE_APP_USER);

        Person person = new Person(1, "Karmand", "Aziz", "Karmand94@gmail.com", user);


        System.out.println(person.getCredentials());






    }
}
