package com.company.ZadaniaInterfejsyOrazKolekcje.Kolekcje.Zadanie5;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        String tekst = "czytam bardzo dlugi bardzo bardzo dlugi tekst tekst bardzo dlugi";
        System.out.println(zliczWystapieniaSlow(tekst));

    }

    public static Map<String, Integer> zliczWystapieniaSlow(String tekst) {

        Map<String, Integer> iloscWystapien = new TreeMap<>();
        String[] tablicaStringow = tekst.split(" ");
        for (String s : tablicaStringow) {
            if (!iloscWystapien.containsKey(s)) {
                iloscWystapien.put(s, 1);
            } else {
                int ilosc = iloscWystapien.get(s);
                iloscWystapien.put(s, ilosc + 1);
            }
        }
        return iloscWystapien;
    }
}