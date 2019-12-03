package com.company.ZadaniaInterfejsyOrazKolekcje.Zadanie1;

public class Brama extends ElementDomu{

    public Brama(boolean czyOtwarty) {
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