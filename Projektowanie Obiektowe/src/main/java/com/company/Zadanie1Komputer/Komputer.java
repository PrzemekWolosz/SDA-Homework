package com.company.Zadanie1Komputer;

public class Komputer {

    protected int potrzebnaMoc;
    protected String producent;
    TypProcesora typProcesora;

    public Komputer(int potrzebnaMoc, String producent, TypProcesora typProcesora) {
        this.potrzebnaMoc = potrzebnaMoc;
        this.producent = producent;
        this.typProcesora = typProcesora;
    }

    public int getPotrzebnaMoc() {
        return potrzebnaMoc;
    }

    public void setPotrzebnaMoc(int potrzebnaMoc) {
        this.potrzebnaMoc = potrzebnaMoc;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public TypProcesora getTypProcesora() {
        return typProcesora;
    }

    public void setTypProcesora(TypProcesora typProcesora) {
        this.typProcesora = typProcesora;
    }

    @Override
    public String toString() {
        return "Komputer marki " + getProducent() + " z procesorem " + getTypProcesora() + " i zapotrzebowaniem na moc " + getPotrzebnaMoc();
    }

}
