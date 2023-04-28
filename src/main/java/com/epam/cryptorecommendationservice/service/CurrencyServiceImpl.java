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
                "MIN(c.price) AS min, MAX(c.price) AS max, " +
                "o.price AS oldest, n.price AS newest " +
                "FROM currency AS c, " +
                "(SELECT price FROM currency WHERE symbol=? ORDER BY timestamp ASC LIMIT 1) AS o, " +
                "(SELECT price FROM currency WHERE symbol=? ORDER BY timestamp DESC LIMIT 1) AS n " +
                "WHERE symbol=? GROUP BY o.price, n.price";
        return jdbcTemplate.queryForObject(
                query, new Object[] {currency, currency, currency}, new CurrencyStatisticMapper());
    }

    @Override
    public void getComparisonOfNormalizedRange() {

    }

    @Override
    public void getHighestNormalizedRangePerDay() {

    }
}
