package com.jos.dem.solid.lsp;

import java.math.BigDecimal;

public class Salesman implements Employee {
	
	private BigDecimal commission = new BigDecimal(10);

	public BigDecimal getPaymentAmount() {
		return monthlySalary.add(commission);
  }
  
  @Override
  public String toString(){
    return this.getClass().getName() + " earns " + getPaymentAmount();
  }

}