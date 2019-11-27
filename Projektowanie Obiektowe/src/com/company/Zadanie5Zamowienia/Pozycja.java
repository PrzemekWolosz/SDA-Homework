package com.company.Zadanie5Zamowienia;

public class Pozycja {

    private String nazwaTowaru;
    private int iloscSztuk;
    private double cenaSztuki;

    public Pozycja(String nazwaTowaru, int iloscSztuk, double cenaSztuki) {
        this.nazwaTowaru = nazwaTowaru;
        this.iloscSztuk = iloscSztuk;
        this.cenaSztuki = cenaSztuki;
    }

    public double obliczWartosc() {
        return cenaSztuki*iloscSztuk;
    }

    @Override
    public String toString() {
        return
                this.nazwaTowaru + "  " +
                this.cenaSztuki + "zł " +
                this.iloscSztuk + "szt.  " +
                obliczWartosc() + "zł "
                 + "\n";
    }
}
