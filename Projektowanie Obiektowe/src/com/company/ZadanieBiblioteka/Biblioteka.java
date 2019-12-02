package com.company.ZadanieBiblioteka;

import java.util.Arrays;

public class Biblioteka {

    Egzemplarz[] tablicaEgzemplarzy;
    Egzemplarz[] znalezioneEgzemplarze;

    public Biblioteka(Egzemplarz[] tablicaEgzemplarzy) {
        this.tablicaEgzemplarzy = tablicaEgzemplarzy;
    }

    public Egzemplarz[] szukajPoTytule(String tytul) {
        Egzemplarz[] znalezioneEgzemplarze = new Egzemplarz[10];
        for (int i = 0; i < tablicaEgzemplarzy.length; i++) {
            if (tablicaEgzemplarzy[i].getTytul().equals(tytul)) {
                znalezioneEgzemplarze[i] = tablicaEgzemplarzy[i];
            }
        }
        return znalezioneEgzemplarze;
    }

    public Egzemplarz[] szukajPoAutorze(String imie, String nazwisko) {
        Egzemplarz[] znalezioneEgzemplarze = new Egzemplarz[10];
        for (int i = 0; i < tablicaEgzemplarzy.length; i++) {
            if (tablicaEgzemplarzy[i].autor.getImie().equals(imie) && tablicaEgzemplarzy[i].autor.getNazwisko().equals(nazwisko)) {
                znalezioneEgzemplarze[i] = tablicaEgzemplarzy[i];
            }
        }
        return znalezioneEgzemplarze;
    }

    @Override
    public String toString() {
        return "Biblioteka{" +
                ", znalezioneEgzemplarze=" + Arrays.toString(znalezioneEgzemplarze) +
                '}';
    }
}