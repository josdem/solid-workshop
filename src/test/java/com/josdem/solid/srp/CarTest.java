package com.josdem.solid.srp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CarTest {

    @Test
    @DisplayName("validating a new car")
    void shouldValidateCar(){
        var car = new Car();
        assertTrue(car.isEmpty(), "should have an empty tank");
    }

}
