package com.josdem.solid.ocp;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void shouldGetEngineerSalary() {
        BigDecimal salary = new BigDecimal(100);
        Employee engineer = new Engineer();
        assertEquals(salary, engineer.getPaymentAmount());
    }

    @Test
    public void shouldGetSalesmanSalary() {
        BigDecimal salary = new BigDecimal(110);
        Employee salesman = new Salesman();
        assertEquals(salary, salesman.getPaymentAmount());
    }

    @Test
    public void shouldGetManagerSalary() {
        BigDecimal salary = new BigDecimal(120);
        Employee manager = new Manager();
        assertEquals(salary, manager.getPaymentAmount());
    }

}