package com.company.ZadaniaInterfejsyOrazKolekcje.Zadanie4;

public class Trojkat extends Wielokat implements Figura {

    private double wysokosc;
    private double bokA;
    private double bokB;
    private double podstawa;


    @Override
    public double obliczPole() {
        return podstawa * wysokosc / 2;
    }

    @Override
    public double obliczObwod() {
        return bokA + bokB + podstawa;
    }

    @Override
    public void wypiszOpis() {
        System.out.println("Parametry pomiaru trójkąta:\n" +
                "pole: podstawa, wysokość\n" +
                "obwód: podstawa, bok a, bok b");
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
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

    public double getPodstawa() {
        return podstawa;
    }

    public void setPodstawa(double podstawa) {
        this.podstawa = podstawa;
    }
}