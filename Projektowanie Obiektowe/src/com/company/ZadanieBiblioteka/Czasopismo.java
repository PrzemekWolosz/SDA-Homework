package com.company.ZadanieBiblioteka;

public class Czasopismo extends Egzemplarz {

    public Czasopismo(String tytul, Autor autor) {
        super(tytul, autor);
    }

    @Override
    public String toString() {
        return "Czasopismo{ tytuł: \"" + getTytul() + "\" " +
                "autor: " + getAutor() +
                '}';
    }
}