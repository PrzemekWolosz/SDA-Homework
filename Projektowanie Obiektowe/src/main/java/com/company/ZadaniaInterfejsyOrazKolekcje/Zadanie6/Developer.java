package com.company.ZadaniaInterfejsyOrazKolekcje.Zadanie6;

import java.util.Arrays;

public class Developer {

    private String nazwa;
    private double kapitalZakladowy;
    private double ocenaDewelopera;
    private Budynek[] ofertyBudynkow;

    public Developer(String nazwa, double kapitalZakladowy, double ocenaDewelopera, Budynek[] oferty) {
        this.nazwa = nazwa;
        this.kapitalZakladowy = kapitalZakladowy;
        this.ocenaDewelopera = ocenaDewelopera;
        this.ofertyBudynkow = oferty;
    }

    public void wypiszOfertyBudynkow() {
        for (Budynek budynek: ofertyBudynkow) {
            System.out.println(budynek.toString());
        }
    }

    public void wypiszOfertyMieszkan() {
        for (Budynek budynek: ofertyBudynkow) {
            System.out.println(budynek.toString());
            for (Budynek value : ofertyBudynkow) {
                System.out.println(Arrays.toString(value.getOfertyMieszkan()));
            }
        }
    }

    public double podajLacznaWartoscInwestycjiNetto() {
        double lacznaWartoscInwestycjiNetto = 0;
        for (Budynek budynek: ofertyBudynkow) {
            lacznaWartoscInwestycjiNetto += budynek.podajLacznaWartoscBudynkuNetto();
        }
        return lacznaWartoscInwestycjiNetto;
    }

    public double podajLacznaWartoscInwestycjiBrutto() {
        double lacznaWartoscInwestycjiBrutto = 0;
        for (Budynek budynek: ofertyBudynkow) {
            lacznaWartoscInwestycjiBrutto += budynek.podajLacznaWartoscBudynkuBrutto();
        }
        return lacznaWartoscInwestycjiBrutto;
    }
}