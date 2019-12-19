package com.company.ZadanieWesele;

public enum InvitationType {
    SINGLE(1),
    WITH_A_COMPANION(2);

    private int numberOfPeople;

    InvitationType(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

}
