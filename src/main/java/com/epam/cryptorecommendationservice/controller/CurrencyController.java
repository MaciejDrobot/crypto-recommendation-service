package com.epam.cryptorecommendationservice.controller;

import com.epam.cryptorecommendationservice.model.CurrencyNormalized;
import com.epam.cryptorecommendationservice.model.CurrencyStatistic;
import com.epam.cryptorecommendationservice.service.CurrencyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/currency")
public class CurrencyController {

    private String CURRENCY_NOT_SUPPORTED =
            "Requested currency is currently not supported.";

    @Autowired
    private CurrencyServiceImpl service;

    @GetMapping("/monthly-stats/{symbol}")
    public ResponseEntity<CurrencyStatistic> getCurrencyStatistics(@PathVariable String symbol) {
        var supportedCurrencies = service.availableCurrencies();
        if (!supportedCurrencies.contains(symbol))
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        var response = service.getLastMonthStatistics(symbol);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/normalized")
    public ResponseEntity<List<CurrencyNormalized>> getNormalizedRange() {
        var response = service.getCurrenciesByNormalizedRange();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
