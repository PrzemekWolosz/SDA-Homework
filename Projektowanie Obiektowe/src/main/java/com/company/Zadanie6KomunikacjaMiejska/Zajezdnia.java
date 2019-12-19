package com.company.Zadanie6KomunikacjaMiejska;

import java.util.Arrays;

public class Zajezdnia {

    private String nazwa;
    Pojazd[] pojazdy;

    public Zajezdnia(Pojazd[] pojazdy, String nazwa) {
        this.pojazdy = pojazdy;
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Zajezdnia \n" +
                "nazwa: '" + nazwa + '\'' + "\n" +
                "pojazdy: " + Arrays.toString(pojazdy);
    }

    public String getNazwa() {
        return nazwa;
    }
}