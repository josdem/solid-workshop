package com.jos.dem.solid.dip;

import java.util.List;

public interface PersonRepository{
  List<Person> findAll();
}