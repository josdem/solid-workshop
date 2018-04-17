package com.jos.dem.solid.srp

import spock.lang.Specification

class CarSpec extends Specification {

  void "should start with full tank"(){
    when:'A car'
      Car car = new Car()
    then:'We expect is full of gas'  
      car.isFull() == true
  }

}