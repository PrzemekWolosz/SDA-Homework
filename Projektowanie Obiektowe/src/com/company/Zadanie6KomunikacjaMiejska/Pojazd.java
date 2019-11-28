package com.company.Zadanie6KomunikacjaMiejska;

public class Pojazd {

    private int vMax;
    private int numer;
    String nazwaZajezdni;


    public Pojazd(int vMax, int number, String nazwaZajezdni) {
        this.vMax = vMax;
        this.numer = number;
        this.nazwaZajezdni = nazwaZajezdni;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "vMax=" + vMax +
                ", number=" + numer +
                ", zajezdnia=" + nazwaZajezdni +
                '}';
    }

    public int getvMax() {
        return vMax;
    }

    public int getNumer() {
        return numer;
    }
}
