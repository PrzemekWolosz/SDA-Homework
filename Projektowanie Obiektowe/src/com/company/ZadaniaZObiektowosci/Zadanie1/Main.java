package com.company.ZadaniaZObiektowosci.Zadanie1;

public class Main {

    public static void main(String[] args) {

        SalaLekcyjna krolewska = new SalaLekcyjna("królewska", 1);
        SalaLekcyjna szmaragdowa = new SalaLekcyjna("szmaragdowa", 2);
        SalaLekcyjna blekitna = new SalaLekcyjna("błękitna", 3);

        krolewska.wypiszDaneSali();
        szmaragdowa.wypiszDaneSali();
        blekitna.wypiszDaneSali();
    }
}
