package com.epam.cryptorecommendationservice.dataloader;

import com.epam.cryptorecommendationservice.model.Currency;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class BatchCurrencyRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional
    public void saveAll(List<Currency> currencies) {
        jdbcTemplate.batchUpdate("INSERT INTO currency (TIMESTAMP, SYMBOL, PRICE) " +
                        "VALUES (?, ?, ?)",
                currencies,
                50,
                (PreparedStatement ps, Currency currency) -> {
                    ps.setTimestamp(1, Timestamp.valueOf(currency.getTimestamp()));
                    ps.setString(2, currency.getSymbol());
                    ps.setDouble(3, currency.getPrice());
                });
    }

    @Transactional
    public List<Currency> getAllRecords() {
        String sql = "SELECT * FROM CURRENCY";
        return jdbcTemplate.query(
                sql, new CurrencyRowMapper());
    }

}
