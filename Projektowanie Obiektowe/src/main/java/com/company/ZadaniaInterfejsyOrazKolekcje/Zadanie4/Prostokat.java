package com.company.ZadaniaInterfejsyOrazKolekcje.Zadanie4;

public class Prostokat extends Wielokat implements Figura {

    private double bokA;
    private double bokB;

    @Override
    public double obliczPole() {
        return bokA * bokB;
    }

    @Override
    public double obliczObwod() {
        return 2 * bokA + 2 * bokB;
    }

    @Override
    public void wypiszOpis() {
        System.out.println("Parametry pomiaru prostokąta:\n" +
                "pole: bok a, bok b\n" +
                "obwód: bok a, bok b");
    }

    public double getBokA() {
        return bokA;
    }

    public void setBokA(double bokA) {
        this.bokA = bokA;
    }

    public double getBokB() {
        return bokB;
    }

    public void setBokB(double bokB) {
        this.bokB = bokB;
    }
}