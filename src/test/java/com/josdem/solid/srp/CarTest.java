package com.josdem.solid.srp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CarTest {

    private final Car car = new Car();

    @Test
    @DisplayName("validating a new car")
    void shouldValidateCar() {
        assertTrue(car.isEmpty(), "should have an empty tank");
    }

    @Test
    @DisplayName("filling fuel talk to full")
    void shouldFuelToFull() {
        car.fuelToFull();
        assertTrue(car.isFull(), "should have a full tank");
    }

}
