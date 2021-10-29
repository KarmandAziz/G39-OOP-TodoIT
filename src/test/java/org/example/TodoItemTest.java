package org.example;

import org.example.model.Person;
import org.example.model.TodoItem;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TodoItemTest {


    public static final String FIRST_NAME = "Arne";
    public static final String LAST_NAME = "Svensson";
    public static final String EMAIL = "Arne23@hotmail.com";
    public static final String TITLE = "Programming";
    public static final String TASK_DESCRIPTION = "Make applications";
    public static final LocalDate DEADLINE = LocalDate.parse("2021-10-15");
    public static final boolean DONE = true;
    public static final int PERSONID = 1;
    public static final int TODOID = 1;
    public static final int CREATORID = 2324;
    public static final String CREATORFIRSTNAME = "Karmand";
    public static final String CREATORLASTNAME = "Aziz";
    public static final String CREATOREMAIL = "Karmand94gmail.com";
    private TodoItem testObject;
    private Person person;
    private Person creator;


    @Before
    public void setUp(){
        creator = new Person(
                CREATORID,
                CREATORFIRSTNAME, CREATORLASTNAME,
                CREATOREMAIL);
        person = new Person(
                PERSONID,
                FIRST_NAME,
                LAST_NAME,
                EMAIL);
        testObject = new TodoItem(
                TODOID,
                TITLE,
                TASK_DESCRIPTION,
                DEADLINE,
                DONE,
                person
        );
    }
    @Test
    public void setTestObject_successfully_instantiated() {
        assertNotNull(String.valueOf(TODOID), testObject.getId());
        assertEquals(TITLE, testObject.getTitle());
        assertEquals(TASK_DESCRIPTION, testObject.getTaskDescription());
        assertEquals(DEADLINE, testObject.getDeadline());
        assertTrue(String.valueOf(DONE), testObject.isDone());
        assertEquals(person, testObject.getCreator());
        assertTrue(String.valueOf(DEADLINE), testObject.isOverdue());
        assertEquals(DONE, testObject.isDone());
        assertTrue(String.valueOf(DONE), testObject.isDone());
        assertEquals(("Creator: " + person.getSummary() + "\n"
                + "Title: "+TITLE + "\n"
                + "Task: " + TASK_DESCRIPTION + "\n"
                + "Deadline: " + DEADLINE + "\n"
                + "Finished: " + DONE + "\n"), testObject.getSummary());

        assertNotEquals(person.getSummary(), creator.getSummary());
    }


    @Test(expected = RuntimeException.class)
    public void constructor_throw_runtimeException_on_null() {
        new TodoItem(0,null,null,null, true,null);
    }
}