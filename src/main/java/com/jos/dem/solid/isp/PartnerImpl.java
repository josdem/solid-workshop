package com.jos.dem.solid.isp;

import java.math.BigDecimal;

public class PartnerImpl implements Partner {

  private static final BigDecimal BASE_SALARY = new BigDecimal(100);
  private static final BigDecimal PROFIT_PERCENTAGE = new BigDecimal(20);
  private Integer hours;

  public PartnerImpl(Integer hours){
    this.hours = hours;
  }

	@Override
	public BigDecimal getBaseAmount() {
		return BASE_SALARY.multiply(new BigDecimal(hours));
	}

	@Override
	public BigDecimal getProfits() {
		return getBaseAmount().multiply(PROFIT_PERCENTAGE).divide(new BigDecimal(100));
  }

}
