package com.company.Zadanie2Glosowanie;

public class Townsman extends Citizen {

    @Override
    public boolean canVote() {
        return true;
    }

    public Townsman(String imie) {
        super(imie);
    }

    @Override
    public String toString() {
        return "Townsman{}";
    }
}
