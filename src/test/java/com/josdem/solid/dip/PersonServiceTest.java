package com.josdem.solid.dip;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonServiceTest {

    private static final PersonService personService = new PersonService();

    @BeforeEach
    public void setup() {
        personService.setPersonRepository(new PersonMemoryRepository());
    }

    @Test
    public void shouldListPersons() {
        List<Person> persons = personService.getAll();
        assertEquals(1, persons.size());
    }

}