package org.example;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class TodoItemTest {


    public static final String FIRST_NAME = "Arne";
    public static final String LAST_NAME = "Svensson";
    public static final String EMAIL = "Arne23@hotmail.com";
    public static final String TITLE = "Programming";
    public static final String TASK_DESCRIPTION = "Make applications";
    public static final LocalDate DEADLINE = LocalDate.parse("2020-10-15");
    public static final boolean BOOLEAN = true;
    private TodoItem testObject;
    private Person person;


    @Before
    public void setUp(){
        person = new Person(
                1,
                FIRST_NAME,
                LAST_NAME,
                EMAIL);
        testObject = new TodoItem(
                1,
                TITLE,
                TASK_DESCRIPTION,
                DEADLINE,
                BOOLEAN,
                person
        );
    }
    @Test
    public void setTestObject_successfully_instantiated() {
        assertEquals(TITLE, testObject.getTitle());
        assertEquals(TASK_DESCRIPTION, testObject.getTaskDescription());
        assertEquals(DEADLINE, testObject.getDeadline());
        assertTrue(String.valueOf(BOOLEAN), testObject.isDone());
        assertEquals(person, testObject.getCreator());
    }


    @Test(expected = RuntimeException.class)
    public void constructor_throw_runtimeException_on_null() {
        new TodoItem(0,null,null,null, true,null);
    }
}