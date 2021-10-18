package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TodoItem task = new TodoItem(1,
                "Karmand",
                "Do something",
                ,
                true,
                "Karmand Aziz");

        System.out.println(task.getCreator());


        Person karmand = new Person(1,
                "Karmand",
                "Aziz",
                "Karmand94@gmail.com");

        karmand.setFirstName("Arne");
        karmand.setLastName("Svensson");

        System.out.println(karmand.getSummary());

    }
}
