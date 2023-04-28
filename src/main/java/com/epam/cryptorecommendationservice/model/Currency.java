package com.epam.cryptorecommendationservice.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    int id;
    @Column(name = "timestamp", nullable = false)
    LocalDateTime timestamp;
    @Column(name = "symbol", nullable = false)
    String symbol;
    @Column(name = "price", nullable = false)
    double price;

    public Currency() {
    }

    public Currency(LocalDateTime timestamp, String symbol, float price) {
        this.timestamp = timestamp;
        this.symbol = symbol;
        this.price = price;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
