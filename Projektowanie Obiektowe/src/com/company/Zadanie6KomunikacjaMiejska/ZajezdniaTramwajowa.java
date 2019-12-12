package com.company.Zadanie6KomunikacjaMiejska;

import java.util.Arrays;

public class ZajezdniaTramwajowa extends Zajezdnia {

    Tramwaj[] tramwaj;

    public ZajezdniaTramwajowa(Pojazd[] pojazdy, String nazwa) {
        super(pojazdy, nazwa);
    }

    @Override
    public String toString() {
        return "ZajezdniaTramwajowa{" +
                "nazwa='" + getNazwa() + '\'' +
                "pojazdy=" + Arrays.toString(pojazdy) +
                "łączna ilość wagonów w taborze: " + zliczWagony() +
                '}';
    }

    public int zliczWagony() {
        int iloscWagonow = 0;
        for (int i = 0; i < tramwaj.length; i++) {
            iloscWagonow += tramwaj[i].getIloscWagonow();
        }
        return iloscWagonow;
    }
}