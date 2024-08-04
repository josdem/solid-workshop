package com.josdem.solid.srp;
public class FuelPump {
    public void reFuel(Car car){
        while(!car.isFull()){
            car.addGas();
        }
    }

}