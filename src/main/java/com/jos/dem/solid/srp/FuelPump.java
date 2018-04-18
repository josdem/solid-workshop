package com.jos.dem.solid.srp;

public class FuelPump {

  public void reFuel(Car car){
    while(!car.isFull()){
      car.increment();
    }
  }

}