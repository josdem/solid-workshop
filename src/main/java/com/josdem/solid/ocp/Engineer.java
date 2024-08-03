package com.josdem.solid.ocp;

import java.math.BigDecimal;

public class Engineer implements Employee {
	
	public BigDecimal getPaymentAmount() {
		return monthlySalary;
	}

}