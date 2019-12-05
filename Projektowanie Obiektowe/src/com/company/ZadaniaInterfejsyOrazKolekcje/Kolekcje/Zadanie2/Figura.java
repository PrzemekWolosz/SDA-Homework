package com.company.ZadaniaInterfejsyOrazKolekcje.Kolekcje.Zadanie2;

public abstract class Figura implements Comparable {

    private double pole;
    public abstract double obliczPole();

    @Override
    public int compareTo(Object o) {
        Figura that = (Figura) o;
        return Double.compare(this.obliczPole(), ((Figura)(o)).obliczPole());
    }

    @Override
    public String toString() {
        return "Figura{" +
                "pole=" + obliczPole() +
                '}';
    }
}
