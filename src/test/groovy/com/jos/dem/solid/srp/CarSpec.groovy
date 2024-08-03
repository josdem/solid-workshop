package com.jos.dem.solid.srp

import com.josdem.solid.srp.Car
import spock.lang.Specification

class CarSpec extends Specification {

  void "should start with empty tank"(){
    when:'A car'
    Car car = new Car()
    then:'We expect is empty gas'  
      car.isEmpty() == true
  }

}