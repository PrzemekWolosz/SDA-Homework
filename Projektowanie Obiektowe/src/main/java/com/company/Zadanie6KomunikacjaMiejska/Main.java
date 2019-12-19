package com.company.Zadanie6KomunikacjaMiejska;

public class Main {
    public static void main(String[] args) {

        Pojazd autobus1 = new Autobus(60, 11, "autobusowa", 120.55);
        Pojazd autobus2 = new Autobus(70, 22, "autobusowa", 280.90);
        Pojazd autobus3 = new Autobus(35, 33, "autobusowa", 58.0);

        Pojazd tramwaj1 = new Tramwaj(45, 01, "tramwajowa", 2);
        Pojazd tramwaj2 = new Tramwaj(35, 02, "tramwajowa", 3);
        Pojazd tramwaj3 = new Tramwaj(55, 03, "tramwajowa", 1);

        Pojazd[] autobusy = {autobus1, autobus2, autobus3};
        Pojazd[] tramwaje = {tramwaj1, tramwaj2, tramwaj3};

        Zajezdnia zajezdniaAutobusowa = new Zajezdnia(autobusy, "autobusowa");
        Zajezdnia zajezdniaTramwajowa = new Zajezdnia(tramwaje, "tramwajowa");

//        System.out.println(autobus1.toString());
//        System.out.println(tramwaj2.toString());

        System.out.println(zajezdniaAutobusowa.toString());
    }
}