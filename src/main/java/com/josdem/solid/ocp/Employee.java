package com.josdem.solid.ocp;

import java.math.BigDecimal;

public class Employee {

    private final BigDecimal baseSalary = new BigDecimal("100.00");
    private final BigDecimal bonus = new BigDecimal("20.00");
    private final BigDecimal commission = new BigDecimal("10.00");

    public BigDecimal getPaymentAmount(EmployeeType type) {

        return switch (type) {
            case ENGINEER -> baseSalary;
            case SALESMAN -> baseSalary.add(commission);
            case MANAGER -> baseSalary.add(bonus);
        };

    }
}