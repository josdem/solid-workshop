package com.josdem.solid.isp;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void shouldGetTotalFullTimeAmount() {
        BigDecimal expectedTotal = new BigDecimal(5400);
        List<FullTime> ftes = Arrays.asList(new FullTimeImpl(10), new FullTimeImpl(15), new FullTimeImpl(20));

        assertEquals(expectedTotal, ftes.stream()
                .map(it -> it.getBaseAmount().add(it.getProfits()))
                .reduce(BigDecimal.ZERO, BigDecimal::add));
    }

    @Test
    public void shouldGetTotalContractorAmount() {
        BigDecimal expectedTotal = new BigDecimal(4050);
        List<Contractor> contractors = Arrays.asList(new ContractorImpl(10), new ContractorImpl(15), new ContractorImpl(20));

        assertEquals(expectedTotal, contractors.stream()
                .map(it -> it.getBaseAmount().add(it.getBonus()))
                .reduce(BigDecimal.ZERO, BigDecimal::add));
    }

}