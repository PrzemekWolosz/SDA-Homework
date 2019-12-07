package com.company.ZadaniaInterfejsyOrazKolekcje.Kolekcje.Zadanie6;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String tekst = "Hello";
        System.out.println(skorowidzLiterowy(tekst));

    }

    public static Map<String, Set<Integer>> skorowidzLiterowy(String tekst) {

        Map<String, Set<Integer>> mapa = new TreeMap<>();
        String[] podzielonyString = tekst.split("");
        Integer index = 0;

        for (String litera : podzielonyString) {
            if (!mapa.containsKey(litera)) {
                mapa.put(litera, new LinkedHashSet<>());
                mapa.get(litera).add(index);
            } else {
                mapa.get(litera).add(index);
            }
            index++;
        }
        return mapa;
    }
}