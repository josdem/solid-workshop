package com.jos.dem.solid.srp

import spock.lang.Specification

class CarSpec extends Specification {

  void "should start with empty tank"(){
    when:'A car'
      Car car = new Car()
    then:'We expect is full of gas'  
      car.isEmpty() == true
  }

  void "should do a gas fill up"(){
    given:'A car'
      Car car = new Car()
    when:'We expect is full of gas'        
      car.fillUp()
    then:'Car is low of gas'  
      car.isFull() == true
  }
  
}