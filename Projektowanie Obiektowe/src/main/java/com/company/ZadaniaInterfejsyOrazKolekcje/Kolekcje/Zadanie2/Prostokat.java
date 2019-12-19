package com.company.ZadaniaInterfejsyOrazKolekcje.Kolekcje.Zadanie2;

public class Prostokat extends Figura {

    private double bokA;
    private double bokB;

    public Prostokat(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    public double obliczPole() {
        return bokA*bokB;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}