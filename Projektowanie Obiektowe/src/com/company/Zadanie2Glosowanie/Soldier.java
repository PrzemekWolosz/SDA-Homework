package com.company.Zadanie2Glosowanie;

public class Soldier extends Citizen {

    @Override
    public boolean canVote() {
        return true;
    }

    public Soldier(String imie) {
        super(imie);
    }

    @Override
    public String toString() {
        return "Soldier{}";
    }
}
