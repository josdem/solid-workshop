package com.josdem.solid.srp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FuelPumpTest {
    private final FuelPump fuelPump = new FuelPump();

    @Test
    @DisplayName("fulling a car")
    void shouldFuelCar() {
        var car = new Car();
        fuelPump.reFuel(car);
        assertTrue(car.isFull(), "car should be full of gas");
    }
}
