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
        Person karmand = new Person(1,
                "Karmand",
                "Aziz",
                "Karmand94@gmail.com");

        karmand.setFirstName("Arne");
        karmand.setLastName("Svensson");

        System.out.println(karmand.getSummary());

    }
}
