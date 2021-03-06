package org.example;

import org.example.model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    public static final int ID = 1;
    public static final String FIRST_NAME = "Karmand";
    public static final String LAST_NAME = "Aziz";
    public static final String EMAIL = "Karmand94@gmail.com";
    private Person testObject;


    @Before
    public void setUp() {

    }

    @Test
    public void testObject_successfully_created() {
        assertEquals(ID, testObject.getId());
        assertEquals(FIRST_NAME, testObject.getFirstName());
        assertEquals(LAST_NAME, testObject.getLastName());
        assertEquals(EMAIL, testObject.getEmail());


    }

    @Test(expected = RuntimeException.class)
   public void null_throws_runtime_exception(){
        //id is type INTEGER and can't be null!
        //id will throw runtime exception on 0


    }

}