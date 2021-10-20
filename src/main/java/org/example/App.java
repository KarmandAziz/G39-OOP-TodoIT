package org.example;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Person person = new Person(1337, "Karmand", "Aziz", "Karmand94@gmail.com");


        TodoItem item = new TodoItem(1,
                "Prgramming",
                "Write code",
                LocalDate.now(),
                true ,
                person);

        System.out.println(item.getSummary());

    }
}
