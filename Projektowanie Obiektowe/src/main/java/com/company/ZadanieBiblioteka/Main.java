package com.company.ZadanieBiblioteka;

public class Main {
    public static void main(String[] args) {

        Ksiazka ksiazka1 = new Ksiazka("AAA", new Autor("Imie1", "Nazwisko1"));
        Ksiazka ksiazka2 = new Ksiazka("BBB", new Autor("Imie2", "Nazwisko2"));
        Ksiazka ksiazka3 = new Ksiazka("CCC", new Autor("Imie3", "Nazwisko3"));
        Ksiazka ksiazka4 = new Ksiazka("DDD", new Autor("Imie1", "Nazwisko1"));
        Ksiazka ksiazka5 = new Ksiazka("EEE", new Autor("Imie2", "Nazwisko2"));
        Ksiazka ksiazka6 = new Ksiazka("FFF", new Autor("Imie1", "Nazwisko1"));
        Ksiazka ksiazka7 = new Ksiazka("GGG", new Autor("Imie3", "Nazwisko3"));
        Czasopismo czasopismo1 = new Czasopismo("HHH", new Autor("Imie1", "Nazwisko1"));
        Czasopismo czasopismo2 = new Czasopismo("III", new Autor("Imie2", "Nazwisko2"));
        Czasopismo czasopismo3 = new Czasopismo("JJJ", new Autor("Imie3", "Nazwisko3"));


        Egzemplarz[] tablicaEgzemplarzy = {ksiazka1, ksiazka2, ksiazka3, ksiazka4, ksiazka5, ksiazka6, ksiazka7, czasopismo1, czasopismo2, czasopismo3};

        Biblioteka biblioteka = new Biblioteka(tablicaEgzemplarzy);

        wyswietl(biblioteka.szukajPoTytule("AAA"));
        System.out.println();
        Egzemplarz[] wyszukane = biblioteka.szukajPoAutorze("Imie1", "Nazwisko1");
        wyswietl(wyszukane);
    }



    public static void wyswietl(Egzemplarz[] tablicaDoWyswietlenia) {
        for (int i = 0; i <tablicaDoWyswietlenia.length; i++) {
            if(tablicaDoWyswietlenia[i] != null) {
                System.out.println(tablicaDoWyswietlenia[i]);
            }
        }
    }
}