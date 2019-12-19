package com.company.ZadaniaInterfejsyOrazKolekcje.Kolekcje.Zadanie2;

public class Kwadrat extends Figura {

    private double bokA;

    public Kwadrat(double bokA) {
        this.bokA = bokA;
    }

    @Override
    public double obliczPole() {
        return bokA*bokA;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}