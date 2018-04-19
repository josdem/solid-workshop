package com.jos.dem.solid.lsp;

import java.math.BigDecimal;

public class Manager implements Employee {
	
	private BigDecimal bonus = new BigDecimal(20);

	public BigDecimal getPaymentAmount() {
		return monthlySalary.add(bonus);
  }
  
  @Override
  public String toString(){
    return this.getClass().getName() + " earns " + getPaymentAmount();
  }

}