package com.epam.cryptorecommendationservice.model;

public class CurrencyStatistic {

    String symbol;
    double min;
    double max;
    double oldest;
    double newest;

    public CurrencyStatistic() {
    }

    public CurrencyStatistic(String symbol, double min, double max, double oldest, double newest) {
        this.symbol = symbol;
        this.min = min;
        this.max = max;
        this.oldest = oldest;
        this.newest = newest;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getOldest() {
        return oldest;
    }

    public void setOldest(double oldest) {
        this.oldest = oldest;
    }

    public double getNewest() {
        return newest;
    }

    public void setNewest(double newest) {
        this.newest = newest;
    }
}
