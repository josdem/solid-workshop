package com.jos.dem.solid.lsp;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Arrays;
import java.math.BigDecimal;
import org.junit.Test;

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