package com.company.ZadaniaInterfejsyOrazKolekcje.Zadanie6;

public class Budynek {

    private String nazwaOsiedla;
    private int iloscOfert;
    private String adres;
    private int etapBudowy;
    private int planowanaDataOddaniaRok;
    private int getPlanowanaDataOddaniaKwartal;
    private double dystansDoCentrum;
    private int etapOsiedla;
    private Mieszkanie[] ofertyMieszkan;

    public Budynek(String nazwaOsiedla, int iloscOfert, String adres, int etapBudowy, int planowanaDataOddaniaRok, int getPlanowanaDataOddaniaKwartal, double dystansDoCentrum, int etapOsiedla, Mieszkanie[] ofertyMieszkan) {
        this.nazwaOsiedla = nazwaOsiedla;
        this.iloscOfert = iloscOfert;
        this.adres = adres;
        this.etapBudowy = etapBudowy;
        this.planowanaDataOddaniaRok = planowanaDataOddaniaRok;
        this.getPlanowanaDataOddaniaKwartal = getPlanowanaDataOddaniaKwartal;
        this.dystansDoCentrum = dystansDoCentrum;
        this.etapOsiedla = etapOsiedla;
        this.ofertyMieszkan = ofertyMieszkan;
    }

    public double podajLacznaWartoscBudynkuNetto() {
        double wartoscBudynkuNetto = 0;
        for (Mieszkanie mieszkanie : ofertyMieszkan) {
            wartoscBudynkuNetto += mieszkanie.obliczCeneNetto();
        }
        return wartoscBudynkuNetto;
    }

    public double podajLacznaWartoscBudynkuBrutto() {
        double wartoscBudynkuBrutto = 0;
        for (Mieszkanie mieszkanie: ofertyMieszkan) {
            wartoscBudynkuBrutto += mieszkanie.obliczCeneBrutto();
        }
        return wartoscBudynkuBrutto;
    }

    @Override
    public String toString() {
        return "Budynek{" +
                "nazwaOsiedla='" + nazwaOsiedla + '\'' +
                ", iloscOfert=" + iloscOfert +
                ", adres='" + adres + '\'' +
                ", etapBudowy=" + etapBudowy +
                ", planowanaDataOddaniaRok=" + planowanaDataOddaniaRok +
                ", getPlanowanaDataOddaniaKwartal=" + getPlanowanaDataOddaniaKwartal +
                ", dystansDoCentrum=" + dystansDoCentrum +
                ", etapOsiedla=" + etapOsiedla +
                "}";
    }

    public Mieszkanie[] getOfertyMieszkan() {
        return ofertyMieszkan;
    }
}