package com.jos.dem.solid.srp

import spock.lang.Specification

class FuelPumpSpec extends Specification {

  FuelPump fuelPump = new FuelPump()

  void "should fuel a car"(){
    given:'A car'
      Car car = new Car()
    when:'We do a gas fill up'        
      fuelPump.reFuel(car)
    then:'Car is full of gas'  
      car.isFull() == true

  }

}