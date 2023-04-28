package com.epam.cryptorecommendationservice.dataloader;

import jakarta.persistence.*;

@Entity
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name = "timestamp", nullable = false)
    Long timestamp;
    @Column(name = "symbol", nullable = false)
    String symbol;
    @Column(name = "price", nullable = false)
    float price;

    public Currency() {
    }

    public Currency(Long timestamp, String symbol, float price) {
        this.timestamp = timestamp;
        this.symbol = symbol;
        this.price = price;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
