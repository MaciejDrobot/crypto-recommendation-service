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
        assertEquals("BTC", actual.getSymbol());
        assertEquals(47722.66, actual.getMax());
        assertEquals(33276.59, actual.getMin());
        assertEquals(46813.21, actual.getOldest());
        assertEquals(38415.79, actual.getNewest());
    }
}