package com.josdem.solid.ocp;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    private final Employee employee = new Employee();

    @Test
    public void shouldGetEngineerSalary() {
        BigDecimal salary = new BigDecimal("100.00");
        assertEquals(salary, employee.getPaymentAmount(EmployeeType.ENGINEER));
    }

    @Test
    public void shouldGetSalesmanSalary() {
        BigDecimal salary = new BigDecimal("110.00");
        assertEquals(salary, employee.getPaymentAmount(EmployeeType.SALESMAN));
    }

    @Test
    public void shouldGetManagerSalary() {
        BigDecimal salary = new BigDecimal("120.00");
        assertEquals(salary, employee.getPaymentAmount(EmployeeType.MANAGER));
    }

}