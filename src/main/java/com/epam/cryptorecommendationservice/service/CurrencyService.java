package com.epam.cryptorecommendationservice.service;

import com.epam.cryptorecommendationservice.model.Currency;
import com.epam.cryptorecommendationservice.model.CurrencyNormalized;
import com.epam.cryptorecommendationservice.model.CurrencyStatistic;

import java.util.List;

public interface CurrencyService {

    CurrencyStatistic getLastMonthStatistics(String currency);

    List<CurrencyNormalized> getCurrenciesByNormalizedRange();

    void getHighestNormalizedRangePerDay();


}
