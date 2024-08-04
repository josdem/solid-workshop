package com.josdem.solid.slp;

import com.josdem.solid.lsp.Employee;
import com.josdem.solid.lsp.Engineer;
import com.josdem.solid.lsp.Manager;
import com.josdem.solid.lsp.Salesman;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    @Test
    public void shouldGetTotalSalary() {
        BigDecimal expectedTotal = new BigDecimal(330);
        Employee engineer = new Engineer();
        Employee manager = new Manager();
        Employee salesman = new Salesman();
        List<Employee> employees = Arrays.asList(engineer, manager, salesman);
        assertEquals(expectedTotal, employees.stream().map(Employee::getPaymentAmount).reduce(BigDecimal.ZERO, BigDecimal::add));
    }

}