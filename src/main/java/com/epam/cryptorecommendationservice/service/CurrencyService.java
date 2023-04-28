package com.epam.cryptorecommendationservice.service;

import com.epam.cryptorecommendationservice.model.CurrencyStatistic;

public interface CurrencyService {

    CurrencyStatistic getLastMonthStatistics(String currency);

    void getComparisonOfNormalizedRange();

    void getHighestNormalizedRangePerDay();


}
