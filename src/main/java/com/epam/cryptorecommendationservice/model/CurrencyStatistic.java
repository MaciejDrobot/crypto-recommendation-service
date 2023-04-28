package com.epam.cryptorecommendationservice.model;

import java.time.LocalDateTime;

public class CurrencyStatistic {

    double min;
    double max;
    LocalDateTime oldest;
    LocalDateTime newest;

    public CurrencyStatistic() {
    }

    public CurrencyStatistic(double min, double max, LocalDateTime oldest, LocalDateTime newest) {
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

    public LocalDateTime getOldest() {
        return oldest;
    }

    public void setOldest(LocalDateTime oldest) {
        this.oldest = oldest;
    }

    public LocalDateTime getNewest() {
        return newest;
    }

    public void setNewest(LocalDateTime newest) {
        this.newest = newest;
    }
}
