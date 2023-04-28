package com.epam.cryptorecommendationservice.model;

public class CurrencyNormalized {

    String symbol;
    double price;
    double normalizedPrice;

    public CurrencyNormalized() {
    }

    public CurrencyNormalized(String symbol, double price, double normalizedPrice) {
        this.symbol = symbol;
        this.price = price;
        this.normalizedPrice = normalizedPrice;
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

    public double getNormalizedPrice() {
        return normalizedPrice;
    }

    public void setNormalizedPrice(double normalizedPrice) {
        this.normalizedPrice = normalizedPrice;
    }
}
