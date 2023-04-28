package com.epam.cryptorecommendationservice.service;

import com.epam.cryptorecommendationservice.model.CurrencyStatistic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public CurrencyStatistic getLastMonthStatistics(String currency) {
        String query = "SELECT " +
                "MIN(price) AS min, " +
                "MAX(price) AS max, " +
                "MIN(timestamp) AS oldest, " +
                "MAX(timestamp) as newest " +
                "FROM currency " +
                "WHERE symbol=?";
        return jdbcTemplate.queryForObject(
                query, new Object[] {currency}, new CurrencyStatisticMapper());
    }

    @Override
    public void getComparisonOfNormalizedRange() {

    }

    @Override
    public void getHighestNormalizedRangePerDay() {

    }
}
