package com.jos.dem.solid.srp;

public class Car {
  private static final int MAX_FUEL = 40;
  private int fuel;  

  public void increment() {
    this.fuel++;
  }

  public boolean isFull(){
    return fuel == MAX_FUEL;
  }

  public boolean isEmpty(){
    return fuel == 0;
  }

}