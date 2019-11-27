package com.company.Zadanie5Zamowienia;

import java.util.Arrays;

public class Zamowienie {

    private int maksRozmiar;
    private Pozycja[] pozycje;

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
        pozycje = new Pozycja[maksRozmiar];
    }

    public Zamowienie() {
        this.maksRozmiar = 10;
    }

    public void dodajPozycje(Pozycja pozycja) {
        for (int i = 0; i < pozycje.length; i++) {
            if (pozycje[i] == null) {
                pozycje[i] = pozycja;
                break;
            }
        }
    }

    public double obliczWartosc() {
        double wartoscZamowienia = 0.0;
        for (int i = 0; i < pozycje.length; i++) {
            wartoscZamowienia += pozycje[i].obliczWartosc();
        }
        return wartoscZamowienia;
    }

    @Override
    public String toString() {
        return "Zamowienie:" + "\n" +
                Arrays.toString(pozycje) +
                "Razem: " + obliczWartosc() + "zł";
    }
}