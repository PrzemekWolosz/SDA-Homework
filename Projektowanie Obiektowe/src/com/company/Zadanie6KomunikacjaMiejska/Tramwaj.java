package com.company.Zadanie6KomunikacjaMiejska;

public class Tramwaj extends Pojazd {

    private int iloscWagonow;

    public Tramwaj(int vMax, int number, String nazwaZajezdni, int iloscWagonow) {
        super(vMax, number, nazwaZajezdni);
        this.iloscWagonow = iloscWagonow;
    }

    @Override
    public String toString() {
        return "Tramwaj: " +
                "numer: " + getNumer() + ", " +
                "zajezdnia: " + nazwaZajezdni + ", " +
                "iloscWagonow= " + iloscWagonow + ", " +
                "vMax= " + getvMax() + " km/h" + "\n";
    }

    public int getIloscWagonow() {
        return iloscWagonow;
    }
}