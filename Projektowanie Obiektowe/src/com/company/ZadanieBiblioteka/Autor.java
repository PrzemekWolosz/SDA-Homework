package com.company.ZadanieBiblioteka;

public class Autor {

    private String imie;
    private String nazwisko;

    public Autor(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "imie='" + getImie() + '\'' +
                ", nazwisko='" + getNazwisko() + '\'' +
                '}';
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
}
