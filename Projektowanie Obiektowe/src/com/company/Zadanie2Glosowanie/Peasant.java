package com.company.Zadanie2Glosowanie;

public class Peasant extends Citizen {

    @Override
    public boolean canVote() {
        return false;
    }

    public Peasant(String imie) {
        super(imie);
    }

    @Override
    public String toString() {
        return "Peasant{}";
    }
}
