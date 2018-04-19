package com.jos.dem.solid.lsp;

import java.math.BigDecimal;

public class Engineer implements Employee {
	
	public BigDecimal getPaymentAmount() {
		return monthlySalary;
  }
  
  @Override
  public String toString(){
    return this.getClass().getSimpleName() + " earns " + getPaymentAmount();
  }

}