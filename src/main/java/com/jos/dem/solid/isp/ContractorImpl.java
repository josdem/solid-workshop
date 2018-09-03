package com.jos.dem.solid.isp;

import java.math.BigDecimal;

public  class ContractorImpl implements Contractor {

  private static final BigDecimal BASE_SALARY = new BigDecimal(80);
  private static final BigDecimal BASE_BONUS = new BigDecimal(10);
  private Integer hours;

  public ContractorImpl(Integer hours){
    this.hours = hours;
  }

	@Override
	public BigDecimal getBaseAmount() {
		return BASE_SALARY.multiply(new BigDecimal(hours));
	}

	@Override
	public BigDecimal getBonus() {
		return BASE_BONUS.multiply(new BigDecimal(hours));
  }

}
