package com.company.ZadaniaInterfejsyOrazKolekcje.Zadanie1;

public class Samochod implements IWylaczalny,IWlaczalny {

    private boolean czyWlaczony;

    public Samochod(boolean czyWlaczony) {
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