package com.company.ZadaniaZObiektowosci.Zadanie2;

public class Samochód {

    String nazwa;
    int predkosc;

    public Samochód (String nazwa, int predkosc) {
        this.nazwa = nazwa;
        this.predkosc = predkosc;
    }

    public void wypiszInformacjeOSamochodzie () {
        System.out.println("Samochód " + nazwa + " jedzie z prędkością " + predkosc);
    }

    public void przyspieszO5kmh () {
        predkosc += 5;
    }

    public void zwolnijO5kmh () {
        predkosc -= 5;
    }
}
