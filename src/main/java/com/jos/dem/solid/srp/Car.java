package com.jos.dem.solid.srp;

public class Car {
  private static final int MAX_FUEL = 40;
  private int fuel;

  public void fillUp() {
    this.fuel = MAX_FUEL;
  }

  public int getFuel() {
    return fuel;
  }

  public boolean isFull(){
    return false;
  }

  public void accelerate() {
    fuel--;
  }

}