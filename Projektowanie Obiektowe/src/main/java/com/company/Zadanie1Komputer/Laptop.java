package com.company.Zadanie1Komputer;

public class Laptop extends Komputer {

    protected double wielkoscMatrycy;
    protected boolean czyPosiadaRetine;

    public Laptop(int potrzebnaMoc, String producent, TypProcesora typProcesora, double wielkoscMatrycy, boolean czyPosiadaRetine) {
        super(potrzebnaMoc, producent, typProcesora);
        this.wielkoscMatrycy = wielkoscMatrycy;
        this.czyPosiadaRetine = czyPosiadaRetine;
    }

    public double getWielkoscMatrycy() {
        return wielkoscMatrycy;
    }

    public void setWielkoscMatrycy(double wielkoscMatrycy) {
        this.wielkoscMatrycy = wielkoscMatrycy;
    }

    @Override
    public String toString() {
        return "Laptop marki " + getProducent() + " z procesorem " + getTypProcesora() + " i zapotrzebowaniem na moc " + getPotrzebnaMoc() + " o przekątnej ekranu " + getWielkoscMatrycy();
    }

    public boolean isCzyPosiadaRetine() {
        return czyPosiadaRetine;
    }

    public void setCzyPosiadaRetine(boolean czyPosiadaRetine) {
        this.czyPosiadaRetine = czyPosiadaRetine;
    }
}
