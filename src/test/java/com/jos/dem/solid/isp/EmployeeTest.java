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

    assertEquals(expectedTotal, partners.stream()
      .map(it -> it.getBaseAmount().add(it.getProfits()))
      .reduce(BigDecimal.ZERO, BigDecimal::add));
  }

  @Test
  public void shouldGetTotalContractorAmount(){
    BigDecimal expectedTotal = new BigDecimal(4050);    
    List<Contractor> contractors = Arrays.asList(new ContractorImpl(10), new ContractorImpl(15), new ContractorImpl(20));

    assertEquals(expectedTotal, contractors.stream()
      .map(it -> it.getBaseAmount().add(it.getBonus()))
      .reduce(BigDecimal.ZERO, BigDecimal::add));
  }

}