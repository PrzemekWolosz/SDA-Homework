package com.company.ZadaniaInterfejsyOrazKolekcje.Zadanie7;

public enum CarType {
    TRUCK(0.05),
    CAR(0.02),
    MOTORCYCLE(0.01);

    private double priceForSecondOnHighway;

    CarType(double priceForSecondOnHighway) {
        this.priceForSecondOnHighway = priceForSecondOnHighway;
    }

    public double getPriceForSecondOnHighway() {
        return priceForSecondOnHighway;
    }
}