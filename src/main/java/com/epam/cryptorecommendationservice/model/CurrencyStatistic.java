package com.epam.cryptorecommendationservice.model;

public class CurrencyStatistic {

    double min;
    double max;
    double oldest;
    double newest;

    public CurrencyStatistic() {
    }

    public CurrencyStatistic(double min, double max, double oldest, double newest) {
        this.min = min;
        this.max = max;
        this.oldest = oldest;
        this.newest = newest;
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
