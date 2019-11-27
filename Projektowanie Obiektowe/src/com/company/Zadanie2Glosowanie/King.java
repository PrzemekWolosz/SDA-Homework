package com.company.Zadanie2Glosowanie;

public class King extends Citizen {

    @Override
    public boolean canVote() {
        return false;
    }

    public King(String imie) {
        super(imie);
    }
}
