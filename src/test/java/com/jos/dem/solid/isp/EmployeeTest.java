package com.jos.dem.solid.isp;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class EmployeeTest {

  @Test
  public void shouldGetTotalPartnersAmount(){
    BigDecimal expectedTotal = new BigDecimal(5400);
    List<Partner> partners = Arrays.asList(new PartnerImpl(10), new PartnerImpl(15), new PartnerImpl(20));    
    assertEquals(expectedTotal, partners.stream().map(it -> it.getBaseAmount().add(it.getProfits())).reduce(BigDecimal.ZERO, BigDecimal::add));
  }

}