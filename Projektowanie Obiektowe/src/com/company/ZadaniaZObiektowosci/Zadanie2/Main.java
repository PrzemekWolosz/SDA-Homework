package com.company.ZadaniaZObiektowosci.Zadanie2;

public class Main {
    public static void main(String[] args) {

        Samochód Ford = new Samochód("Focus", 50);
        Samochód Kia = new Samochód("Ceed", 55);
        Samochód VW = new Samochód("Golf", 60);

        Ford.wypiszInformacjeOSamochodzie();
        Ford.przyspieszO5kmh();
        Ford.wypiszInformacjeOSamochodzie();

        Kia.wypiszInformacjeOSamochodzie();
        Kia.przyspieszO5kmh();
        Kia.wypiszInformacjeOSamochodzie();

        VW.wypiszInformacjeOSamochodzie();
        VW.zwolnijO5kmh();
        VW.zwolnijO5kmh();
        VW.wypiszInformacjeOSamochodzie();

    }
}
