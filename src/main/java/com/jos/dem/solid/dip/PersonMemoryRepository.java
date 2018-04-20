package com.jos.dem.solid.dip;

import java.util.Arrays;
import java.util.List;

public class PersonMemoryRepository implements PersonRepository {

  private List<Person> persons = Arrays.asList(new Person("josdem"));

	@Override
	public List<Person> findAll() {
		return persons;
	}

}