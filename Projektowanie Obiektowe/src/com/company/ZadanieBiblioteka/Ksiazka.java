package com.company.ZadanieBiblioteka;

public class Ksiazka extends Egzemplarz {

    public Ksiazka(String tytul, Autor autor) {
        super(tytul, autor);
    }

    @Override
    public String toString() {
        return "Ksiazka{ tytuł: \"" + getTytul() + "\" " +
                "autor: " + getAutor() +
                '}';
    }
}