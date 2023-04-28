package com.epam.cryptorecommendationservice.dataloader;

import com.epam.cryptorecommendationservice.model.Currency;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CurrencyRowMapper implements RowMapper<Currency> {

    @Override
    public Currency mapRow(ResultSet rs, int rowNum) throws SQLException {
        Currency currency = new Currency();
        currency.setTimestamp(rs.getTimestamp("TIMESTAMP").toLocalDateTime());
        currency.setSymbol(rs.getString("SYMBOL"));
        currency.setPrice(rs.getFloat("PRICE"));
        return currency;
    }
}
