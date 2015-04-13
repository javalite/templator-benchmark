package app.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Igor Polevoy on 4/12/15.
 */
public class Person {

    public static List<Person> people  = new ArrayList<Person>();

    static {
        for(int i = 0; i < 100; i++){
            people.add(new Person("first" + i, "last" + i));
        }
    }




    private String firstName, lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
