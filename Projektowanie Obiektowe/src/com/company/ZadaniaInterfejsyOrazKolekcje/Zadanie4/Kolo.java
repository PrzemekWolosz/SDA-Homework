package com.company.ZadaniaInterfejsyOrazKolekcje.Zadanie4;

public class Kolo implements Figura {

    final double liczbaPi = 3.14d;
    private double promien;

    @Override
    public double obliczPole() {
        return promien * promien * liczbaPi;
    }

    @Override
    public double obliczObwod() {
        return 2 * liczbaPi * promien;
    }

    @Override
    public void wypiszOpis() {
        System.out.println("Parametry pomiaru kola:\n" +
                "pole: promien, liczbaPi\n" +
                "obwód: promien, liczbaPi");
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }
}