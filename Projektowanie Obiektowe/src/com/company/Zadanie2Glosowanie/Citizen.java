package com.company.Zadanie2Glosowanie;

public abstract class Citizen {

    protected String imie;
    public abstract boolean canVote();

    public Citizen(String imie) {
        this.imie = imie;
    }
}
