package com.josdem.solid.isp;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FullTimeImpl implements FullTime {

  private static final BigDecimal BASE_SALARY = new BigDecimal(100);
  private static final BigDecimal PROFIT_PERCENTAGE = new BigDecimal(20);
  private final int hours;

  public FullTimeImpl(Integer hours){
    this.hours = hours;
  }

	@Override
	public BigDecimal getBaseAmount() {
		return BASE_SALARY.multiply(new BigDecimal(hours));
	}

	@Override
	public BigDecimal getProfits() {
		return getBaseAmount().multiply(PROFIT_PERCENTAGE).divide(new BigDecimal(100), RoundingMode.HALF_UP);
  }

}
