package com.jos.dem.solid.ocp;

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import org.junit.Test;
import com.jos.dem.solid.ocp.EmployeeType;

public class EmployeeTest {
	
	private Employee employee = new Employee();
	
	@Test
	public void shouldGetEngineerSalary() {
		BigDecimal salary = new BigDecimal(100.00);
		assertEquals(salary, employee.getPaymentAmount(EmployeeType.ENGINEER));
	}
	
	@Test
	public void shouldGetSalesmanSalary() {
		BigDecimal salary = new BigDecimal(110.00);
		assertEquals(salary, employee.getPaymentAmount(EmployeeType.SALESMAN));
	}
	
	@Test
	public void shouldGetManagerSalary() {
		BigDecimal salary = new BigDecimal(120.00);
		assertEquals(salary, employee.getPaymentAmount(EmployeeType.MANAGER));
	}

}