package com.company.ZadaniaOkrojone.Zadanie1do3;

public class Student {
    int numerIndeksu;
    String imie;
    String nazwisko;
    char plec;

    public Student (int numerIndeksu, String imie, String nazwisko, char plec) {
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
    }

    public void przedstawSie () {

        System.out.println("Czesc! Jestem " + imie + " " + nazwisko + ", jestem " + plec + " i mój numer indeksu to " + numerIndeksu);

    }
}
