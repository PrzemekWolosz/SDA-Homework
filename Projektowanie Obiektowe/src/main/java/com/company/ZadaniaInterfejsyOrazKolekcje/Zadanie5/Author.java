package com.company.ZadaniaInterfejsyOrazKolekcje.Zadanie5;

public class Author {

    private String imie;
    private String nazwisko;

    public Author(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

}
