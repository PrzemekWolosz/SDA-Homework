package com.company.ZadanieBiblioteka;

public abstract class Egzemplarz {

    private String tytul;
    Autor autor;

    public Egzemplarz(String tytul, Autor autor) {
        this.tytul = tytul;
        this.autor = autor;
    }

    public String getTytul() {
        return tytul;
    }

    public Autor getAutor() {
        return autor;
    }
}