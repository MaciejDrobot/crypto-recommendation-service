package com.epam.cryptorecommendationservice.controller;

import com.epam.cryptorecommendationservice.model.CurrencyStatistic;
import com.epam.cryptorecommendationservice.service.CurrencyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    @Autowired
    private CurrencyServiceImpl service;

    @GetMapping("/monthly-stats/{symbol}")
    public CurrencyStatistic getCurrencyStatistics(@PathVariable String symbol) {
        return service.getLastMonthStatistics(symbol);
    }
}
