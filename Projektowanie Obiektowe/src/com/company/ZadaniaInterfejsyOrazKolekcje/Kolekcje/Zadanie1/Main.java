package com.company.ZadaniaInterfejsyOrazKolekcje.Kolekcje.Zadanie1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add(0, "Audi");
        lista.add(1, "BMW");
        lista.add(2, "Mercedes");
        lista.add(3, "Volvo");
        lista.add(4, "Lexus");
        lista.add(5, "BMW");
        lista.add(6, "Audi");
        lista.add(7, "BMW");
        lista.add(8, "Mazda");
        lista.add(9, "BMW");

        System.out.println("lista: " + lista);
        wyswietlDuplikaty(lista);
        usunDuplikaty(lista);
    }

    public static void wyswietlDuplikaty(List<String> listaDoPrzeszukania) {
        List<String> duplikaty = new ArrayList<>();
        for (int i = 0; i < listaDoPrzeszukania.size(); i++) {
            if (listaDoPrzeszukania.lastIndexOf(listaDoPrzeszukania.get(i)) != i) {
                duplikaty.add(listaDoPrzeszukania.get(i));
            }
        }
        System.out.println("duplikaty: " + duplikaty);
    }

    public static void usunDuplikaty(List<String> wprowadzListe) {

        LinkedHashSet<String> hashSet = new LinkedHashSet<>(wprowadzListe);
        ArrayList<String> listaBezDuplikatow = new ArrayList<>(hashSet);
        System.out.println("lista bez duplikatow: " + listaBezDuplikatow);
    }
}