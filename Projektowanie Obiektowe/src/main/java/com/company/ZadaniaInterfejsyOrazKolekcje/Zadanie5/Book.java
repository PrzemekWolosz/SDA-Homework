package com.company.ZadaniaInterfejsyOrazKolekcje.Zadanie5;

import java.util.Arrays;

public class Book {

    private String tytul;
    private String isbn;
    private int rokWydania;
    Author[] autorzy = new Author[3];
    private int iloscAutorow;

    public Book(String tytul, String isbn, int rokWydania) {
        this.tytul = tytul;
        this.isbn = isbn;
        this.rokWydania = rokWydania;
        iloscAutorow = 0;
        Author[] autorzy = new Author[3];
    }

    @Override
    public String toString() {
        return tytul + ", autorzy:\n" + Arrays.toString(autorzy);
    }

    public void dodajAutora(Author nowyAutor) {
        for (int i = 0; i < autorzy.length; i++) {
            if (autorzy[i] == null) {
                autorzy[i] = nowyAutor;
                break;
            } else
                System.out.println("Książka może mieć najwięcej 3 autorów");
        }
    }

    public String getTytul() {
        return tytul;
    }

    public int getIloscAutorow() {
        return iloscAutorow;
    }

    public void setIloscAutorow(int iloscAutorow) {
        this.iloscAutorow = iloscAutorow;
    }
}