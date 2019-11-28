package com.company.Zadanie6KomunikacjaMiejska;

import java.util.Arrays;

public class ZajezdniaAutobusowa extends Zajezdnia {

    Autobus[] autobus;

    public ZajezdniaAutobusowa(Pojazd[] pojazdy, String nazwa) {
        super(pojazdy, nazwa);
    }

    @Override
    public String toString() {
        return "ZajezdniaAutobusowa{ \n" +
                "nazwa: '" + getNazwa() + '\'' + "\n" +
                "pojazdy: " + Arrays.toString(pojazdy) + "\n" +
                "paliwo zużyte w tym miesiącu: " + zliczPaliwo() + " l" +
                '}';
    }

    public double zliczPaliwo() {
        double zuzytePaliwo = 0;
        for (int i = 0; i < autobus.length; i++) {
            zuzytePaliwo += autobus[i].getZuzytePaliwo();
        }
        return zuzytePaliwo;
    }
}