package com.company.ZadaniaInterfejsyOrazKolekcje.Zadanie1;

public class Drzwi extends ElementDomu {

    public Drzwi(boolean czyOtwarty) {
        super(czyOtwarty);
    }

    @Override
    public boolean czyOtwarty() {
        return czyOtwarty;
    }

    @Override
    public void otworz() {
        this.czyOtwarty = true;
    }

    @Override
    public void zamknij() {
        this.czyOtwarty = false;
    }
}