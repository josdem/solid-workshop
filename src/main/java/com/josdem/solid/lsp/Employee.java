package com.josdem.solid.lsp;

import java.math.BigDecimal;

public interface Employee {
	
	final BigDecimal monthlySalary = new BigDecimal(100);
	BigDecimal getPaymentAmount();

}