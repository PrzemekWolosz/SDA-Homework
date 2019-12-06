package com.company.ZadaniaInterfejsyOrazKolekcje.Kolekcje.Zadanie4;

import java.util.Map;
import java.util.TreeMap;

public class MapaTest {
    public static void main(String[] args) {

        Map<String, Integer> nowaMapa = new TreeMap<>();

        nowaMapa.put("Bartek", 2);
        nowaMapa.put("Dawid", 3);
        nowaMapa.put("Czarek", 1);
        nowaMapa.put("Adam", 4);

        System.out.println(nowaMapa);

        nowaMapa.put("Adam", 10);

        System.out.println(nowaMapa);

        for (String imie : nowaMapa.keySet()) {
            System.out.println(nowaMapa.get(imie));
        }

    }
}