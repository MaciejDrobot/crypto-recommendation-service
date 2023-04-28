package com.epam.cryptorecommendationservice.service;

import com.epam.cryptorecommendationservice.model.CurrencyNormalized;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CurrencyNormalizedMapper implements RowMapper<CurrencyNormalized> {


    @Override
    public CurrencyNormalized mapRow(ResultSet rs, int rowNum) throws SQLException {
        CurrencyNormalized normalized = new CurrencyNormalized();
        normalized.setSymbol(rs.getString("SYMBOL"));
        normalized.setPrice(Double.parseDouble(String.format("%.2f", rs.getDouble("PRICE"))));
        normalized.setNormalizedPrice(Double.parseDouble(String.format("%.5f", rs.getDouble("NORMALIZED"))));
        return normalized;
    }
}
