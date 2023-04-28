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
        assertEquals("2022-01-01T05:00", String.valueOf(actual.getOldest()));
        assertEquals("2022-01-31T21:00", String.valueOf(actual.getNewest()));
    }

}