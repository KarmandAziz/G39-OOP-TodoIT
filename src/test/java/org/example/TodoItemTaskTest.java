package org.example;

import org.example.model.Person;
import org.example.model.TodoItem;
import org.example.model.TodoItemTask;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TodoItemTaskTest {

    public static final String FIRST_NAME = "Karmand";
    public static final String LAST_NAME = "Aziz";
    public static final String EMAIL = "Karmand94@gmail.com";
    public static final String TITLE = "Programming";
    public static final String TASK_DESCRIPTION = "Make applications";
    public static final LocalDate DEADLINE = LocalDate.parse("2020-10-15");
    public static final boolean DONE = true;
    public static final int ID = 1;
    public static final int PERSONID = 2;
    public static final int TODOID = 3;


    private TodoItemTask testObject;
    private Person person;
    private TodoItem todoItem;



    @Before
    public void setUp() {
        person = new Person(PERSONID,
                FIRST_NAME,
                LAST_NAME,
                EMAIL);
        todoItem = new TodoItem(
                TODOID,
                TITLE,
                TASK_DESCRIPTION,
                DEADLINE,
                DONE, person);

        testObject = new TodoItemTask(
                ID,
                true,
                todoItem,
                person);



        System.out.println(testObject.getSummary());
    }

    @Test
    public void testObject_successfully_instantiated() {
        assertTrue(testObject.isAssigned());
        assertNotNull(String.valueOf(ID), testObject.getId());
        assertNotNull(String.valueOf(testObject.setAssigned(false)));
        assertNotNull(String.valueOf(todoItem), testObject.getTodoItem());
        assertNotNull(String.valueOf(person), testObject.getAssignee());
        assertEquals("Id: " + ID + "\n"
                + "Assigned status: " + true + "\n"
                + "To do: " + todoItem.getTaskDescription() + "\n"
                + "Person: " + person.getSummary(), testObject.getSummary());
    }

    @Test(expected = RuntimeException.class)
    public void constructor_throw_runtimeException_on_null() {
        testObject = new TodoItemTask(0, true, null, null);

    }




}