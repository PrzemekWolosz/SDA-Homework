package com.company.Biblioteka;

public class Biblioteka {

    Autor autor1 = new Autor("Henryk", "Sienkiewicz");
    Autor autor2 = new Autor("Adam", "Mickiewicz");
    Autor autor3 = new Autor("Stanisław", "Lem");

    Ksiazka ksiazka1 = new Ksiazka("Krzyżacy", autor1);
    Ksiazka ksiazka2 = new Ksiazka("Ogniem i mieczem", autor1);

    Ksiazka ksiazka3 = new Ksiazka("Pan Tadeusz", autor2);
    Ksiazka ksiazka4 = new Ksiazka("Sonety krymskie", autor2);

    Ksiazka ksiazka5 = new Ksiazka("Pokoj na ziemi", autor3);
    Ksiazka ksiazka6 = new Ksiazka("Noc księżycowa", autor3);

    private Egzemplarz[] wszystkieTytuly = {ksiazka1, ksiazka2, ksiazka3, ksiazka4, ksiazka5, ksiazka6};
    private Egzemplarz[] tytulyWyszukane;

    public Egzemplarz[] szukajPoTytule(String tytul) {
        for (int i = 0; i < wszystkieTytuly.length; i++) {
            if (wszystkieTytuly[i].tytul.equals(tytul)) {
                tytulyWyszukane[i] = wszystkieTytuly[i];
            }
        }
        return tytulyWyszukane;
    }

    public Egzemplarz[] szukajPoAutorze(String imie, String nazwisko) {
        for (int i = 0; i < wszystkieTytuly.length; i++) {
            if (wszystkieTytuly[i].autor.imie.equals(imie) && wszystkieTytuly[i].autor.nazwisko.equals(nazwisko)) {
                tytulyWyszukane[i] = wszystkieTytuly[i];
            }
        }
        return tytulyWyszukane;
    }

    public static void wyswietlWyniki(Egzemplarz[] wyniki) {
        for (int i = 0; i < wyniki.length; i++) {
            System.out.println(wyniki[i]);
        }
    }
}
