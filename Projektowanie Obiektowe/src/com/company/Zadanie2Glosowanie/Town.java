package com.company.Zadanie2Glosowanie;

public class Town {

    Citizen[] tablicaMieszkancow;

    public static int howManyCanVote(Citizen[] tablica) {
        int canVote = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i].canVote()) {
                canVote++;
            }
        }
        return canVote;
    }

    public static void whoCanVote(Citizen[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i].canVote()) {
                System.out.println(tablica[i].imie);
            }
        }
    }

    public static Citizen[] whoCanVote2(Citizen[] tablica) {
        Citizen[] listaGlosujacych = {};
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i].canVote()) {
                listaGlosujacych[i] = tablica[i];
            }
        }
        return listaGlosujacych;
    }
}