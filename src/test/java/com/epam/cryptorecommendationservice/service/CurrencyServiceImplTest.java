package com.epam.cryptorecommendationservice.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CurrencyServiceImplTest {

    @Autowired
    private CurrencyServiceImpl service;

    @Test
    public void shouldReturnCorrectStatistics() {
        var actual = service.getLastMonthStatistics("BTC");
        assertEquals("47722.66", String.format("%.2f", actual.getMax()));
        assertEquals("33276.59", String.format("%.2f", actual.getMin()));
        assertEquals("46813.21", String.format("%.2f", actual.getOldest()));
        assertEquals("38415.79", String.format("%.2f", actual.getNewest()));

    }

}