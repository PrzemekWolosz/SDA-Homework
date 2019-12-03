package com.company.ZadaniaInterfejsyOrazKolekcje.Zadanie1;

public abstract class ElementDomu implements IOpenable,IOtwieralny,IZamykalny {

    protected boolean czyOtwarty;

    public abstract boolean czyOtwarty();
    public abstract void otworz();
    public abstract void zamknij();

    public ElementDomu(boolean czyOtwarty) {
        this.czyOtwarty = czyOtwarty;
    }
}