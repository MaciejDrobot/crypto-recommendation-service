package com.epam.cryptorecommendationservice.controller;

import com.epam.cryptorecommendationservice.model.CurrencyStatistic;
import com.epam.cryptorecommendationservice.service.CurrencyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/currency")
public class CurrencyController {

    @Autowired
    private CurrencyServiceImpl service;

    @GetMapping("/monthly-stats/{symbol}")
    public ResponseEntity<CurrencyStatistic> getCurrencyStatistics(@PathVariable String symbol) {
        var response = service.getLastMonthStatistics(symbol);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
