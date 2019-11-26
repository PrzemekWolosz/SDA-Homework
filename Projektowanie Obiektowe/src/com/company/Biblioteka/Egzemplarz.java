package com.company.Biblioteka;

public abstract class Egzemplarz extends Biblioteka{

    protected String tytul;
    protected Autor autor;

    public Egzemplarz(String tytul, Autor autor) {
        this.tytul = tytul;
        this.autor = autor;
    }
}