package com.epam.cryptorecommendationservice.service;

import com.epam.cryptorecommendationservice.model.CurrencyStatistic;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

class CurrencyStatisticMapper implements RowMapper<CurrencyStatistic> {

    @Override
    public CurrencyStatistic mapRow(ResultSet rs, int rowNum) throws SQLException {
        CurrencyStatistic statistic = new CurrencyStatistic();
        statistic.setSymbol(rs.getString("SYMBOL"));
        statistic.setMin(Double.parseDouble(String.format("%.2f", rs.getDouble("MIN"))));
        statistic.setMax(Double.parseDouble(String.format("%.2f", rs.getDouble("MAX"))));
        statistic.setOldest(Double.parseDouble(String.format("%.2f", rs.getDouble("OLDEST"))));
        statistic.setNewest(Double.parseDouble(String.format("%.2f", rs.getDouble("NEWEST"))));
        return statistic;
    }
}
