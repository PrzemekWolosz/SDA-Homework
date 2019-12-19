package com.company.ZadaniaInterfejsyOrazKolekcje.Zadanie1;

public class Main {
    public static void main(String[] args) {

        Czajnik czajnik = new Czajnik(false);
        IOpenable okno = new Okno(false);
        IOpenable drzwi = new Drzwi(false);
        IOpenable brama = new Brama(false);
        Alarm alarm = new Alarm(false);
        Samochod samochod = new Samochod(false);

        czajnik.wlacz();
        alarm.wlacz();
        samochod.wlacz();

        IOpenable[] tablica = {okno,drzwi,brama};

        for (IOpenable iOpenable : tablica) {
            iOpenable.otworz();
            System.out.println(iOpenable.czyOtwarty());
        }

        for (IOpenable iOpenable: tablica) {
            iOpenable.zamknij();
            System.out.println(iOpenable.czyOtwarty());
        }
    }
}