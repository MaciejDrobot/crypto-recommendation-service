package com.epam.cryptorecommendationservice.service;

import com.epam.cryptorecommendationservice.model.CurrencyStatistic;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CurrencyStatisticMapper implements RowMapper<CurrencyStatistic> {

    @Override
    public CurrencyStatistic mapRow(ResultSet rs, int rowNum) throws SQLException {
        CurrencyStatistic statistic = new CurrencyStatistic();
        statistic.setMin(rs.getDouble("MIN"));
        statistic.setMax(rs.getDouble("MAX"));
        statistic.setOldest(rs.getDouble("OLDEST"));
        statistic.setNewest(rs.getDouble("NEWEST"));
        return statistic;
    }
}
