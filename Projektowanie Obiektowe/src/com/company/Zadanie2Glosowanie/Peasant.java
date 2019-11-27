package com.company.Zadanie2Glosowanie;

public class Peasant extends Citizen {

    @Override
    public boolean canVote() {
        return false;
    }

    public Peasant(String imie) {
        super(imie);
    }
}
