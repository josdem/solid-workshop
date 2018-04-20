package com.jos.dem.solid.dip;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;

public class PersonServiceTest {

  private PersonService personService = new PersonService(new PersonMemoryRepository());

  @Test
  public void shouldListPersons(){
    List<Person> persons = personService.getAll();
    assertEquals(1, persons.size());
  }

}