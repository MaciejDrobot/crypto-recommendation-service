package com.epam.cryptorecommendationservice.dataloader;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
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
                    ps.setLong(1, currency.getTimestamp());
                    ps.setString(2, currency.getSymbol());
                    ps.setFloat(3, currency.getPrice());
                });
    }

}
