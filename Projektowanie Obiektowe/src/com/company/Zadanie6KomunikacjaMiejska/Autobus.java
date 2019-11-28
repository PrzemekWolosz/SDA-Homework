package com.company.Zadanie6KomunikacjaMiejska;

public class Autobus extends Pojazd {

    private double zuzytePaliwo;

    public Autobus(int vMax, int number, String zajezdnia, double zuzytePaliwo) {
        super(vMax, number, zajezdnia);
        this.zuzytePaliwo = zuzytePaliwo;
    }

    @Override
    public String toString() {
        return "Autobus: " +
                "numer: " + getNumer() + ", " +
                "zajezdnia: " + nazwaZajezdni + ", " +
                "zuzytePaliwo= " + zuzytePaliwo + " l, " +
                "vMax= " + getvMax() + " km/h" + "\n";
    }

    public double getZuzytePaliwo() {
        return zuzytePaliwo;
    }
}
