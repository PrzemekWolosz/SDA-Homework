package com.company.ZadaniaInterfejsyOrazKolekcje.Zadanie1;

public class Alarm implements IWlaczalny,IWylaczalny {

    private boolean czyWlaczony;

    public Alarm(boolean czyWlaczony) {
        this.czyWlaczony = czyWlaczony;
    }

    @Override
    public void wlacz() {
        this.czyWlaczony = true;
    }

    @Override
    public void wylacz() {
        this.czyWlaczony = false;
    }

    @Override
    public boolean czyWlaczony() {
        return czyWlaczony;
    }
}