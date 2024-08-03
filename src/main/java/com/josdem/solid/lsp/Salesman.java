package com.josdem.solid.lsp;

import java.math.BigDecimal;

public class Salesman implements Employee {
	
	private BigDecimal commission = new BigDecimal(10);

	public BigDecimal getPaymentAmount() {
		return monthlySalary.add(commission);
  }

}