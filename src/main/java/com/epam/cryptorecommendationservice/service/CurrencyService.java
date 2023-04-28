package com.epam.cryptorecommendationservice.service;

public interface CurrencyService {

    void getLastMonthStatistics();

    void getComparisonOfNormalizedRange();

    void getHighestNormalizedRangePerDay();


}
