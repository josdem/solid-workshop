package com.jos.dem.solid.dip;

import java.util.List;

public class PersonService {

  private PersonRepository personRepository;

  public PersonService(PersonRepository personRepository){
    this.personRepository = personRepository;
  }

  public List<Person> getAll(){
    return personRepository.findAll();
  }

}