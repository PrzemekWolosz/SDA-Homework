package com.company.ZadaniaInterfejsyOrazKolekcje.Zadanie6;

import java.util.Arrays;

public class Mieszkanie {

    private double powierzchnia;
    private double cenaZaMetrNetto;
    private int iloscPokoi;
    private int iloscLazienek;
    SunGeographicalLocation ekspozycjaOkienMieszkania;
    private double[] powierzchniaPomieszczen;

    public Mieszkanie(double powierzchnia, double cenaZaMetrNetto, int iloscPokoi, int iloscLazienek, SunGeographicalLocation ekspozycjaOkienMieszkania, double[] powierzchniaPomieszczen) {
        this.powierzchnia = powierzchnia;
        this.cenaZaMetrNetto = cenaZaMetrNetto;
        this.iloscPokoi = iloscPokoi;
        this.iloscLazienek = iloscLazienek;
        this.ekspozycjaOkienMieszkania = ekspozycjaOkienMieszkania;
        this.powierzchniaPomieszczen = powierzchniaPomieszczen;
    }

    public double obliczCeneNetto() {
        return powierzchnia*cenaZaMetrNetto;
    }

    public double obliczCeneBrutto() {
        return obliczCeneNetto()*1.23;
    }

    public double obliczCeneZaMetrBrutto() {
        return cenaZaMetrNetto*1.23;
    }

    @Override
    public String toString() {
        return "Mieszkanie{" +
                "powierzchnia=" + powierzchnia +
                ", cenaZaMetrNetto=" + cenaZaMetrNetto +
                ", iloscPokoi=" + iloscPokoi +
                ", iloscLazienek=" + iloscLazienek +
                ", ekspozycjaOkienMieszkania=" + ekspozycjaOkienMieszkania +
                ", powierzchniaPomieszczen=" + Arrays.toString(powierzchniaPomieszczen) +
                '}';
    }
}