package com.jos.dem.solid.srp;

public class Car {
  private static final int MAX_FUEL = 40;
  private int fuel;

  public Car(){
    this.fuel = MAX_FUEL;
  }

  public void fillUp() {
    this.fuel = MAX_FUEL;
  }

  public int getFuel() {
    return fuel;
  }

  public boolean isFull(){
    return fuel == MAX_FUEL;
  }

  public void accelerate() {
    fuel--;
  }

}