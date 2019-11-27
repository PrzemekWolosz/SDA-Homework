package com.company.Zadanie5Zamowienia;

public class Main {
    public static void main(String[] args) {

        Pozycja chleb = new Pozycja("chleb", 1, 3.50);
        Pozycja cukier = new Pozycja("cukier", 2, 2.20);
        Pozycja wino = new Pozycja("wino", 1, 22.50);
        Pozycja czekolada = new Pozycja("czekolada", 3, 4.5);
        Pozycja jablko = new Pozycja("jabłko",5,  0.99);
        Pozycja maslo = new Pozycja("masło",1 , 4.99);

        Zamowienie zamowienie1 = new Zamowienie(5);

        zamowienie1.dodajPozycje(wino);
        zamowienie1.dodajPozycje(czekolada);
        zamowienie1.dodajPozycje(jablko);
        zamowienie1.dodajPozycje(cukier);
        zamowienie1.dodajPozycje(maslo);

        zamowienie1.obliczWartosc();

        System.out.println(zamowienie1.toString());
    }
}