package org.example;

import org.example.data.PersonDAOCollection;
import org.example.io.JSONHandler;
import org.example.model.*;

import java.io.*;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        PersonDAOCollection personDAOCollection = PersonDAOCollection.getInstance();
       // personDAOCollection.persist(
               // new Person(1, "Karmand", "Aziz","Karmand94@gmail.com",
                 //       new AppUser("Karmand", "Secret", AppRole.ROLE_APP_ADMIN)));

        JSONHandler manager = JSONHandler.getInstance();
        List<Person> deserialized = manager.deserializeFromFile(new File("src/main/resources/json/person.json"),Person.class);
        deserialized.forEach(System.out::println);



    shutdown();




    }

    public static void shutdown(){}


    private static void copy(File source, File destination) {
        try(InputStream in = new FileInputStream(source);
            OutputStream out = new FileOutputStream(destination)){

            int b;
            while((b = in.read()) != -1){
                out.write(b);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
