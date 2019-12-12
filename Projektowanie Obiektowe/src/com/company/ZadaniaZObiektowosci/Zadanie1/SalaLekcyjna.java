package com.company.ZadaniaZObiektowosci.Zadanie1;

public class SalaLekcyjna {

    String nazwa;
    int numerSali;

    public void wypiszDaneSali () {
        System.out.println("Sala " + nazwa + " ma numer " + numerSali);
    }

    public SalaLekcyjna(String nazwa, int numerSali) {
        this.nazwa = nazwa;
        this.numerSali = numerSali;
    }
}