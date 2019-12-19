package com.company.KlasaStringWyrazeniaRegularne.Zadanie5;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String text = "This text will be used to count letters in text";

        countOccurrenceLettersInText(text.toLowerCase().replaceAll(" ", ""));

    }

    private static void countOccurrenceLettersInText(String text) {

        String[] charInText = text.split("");
        Map<String, Integer> occurrence = new LinkedHashMap<>();

        for (String s : charInText) {
            if (!occurrence.containsKey(s)) {
                occurrence.put(s, 1);
            } else {
                int value = occurrence.get(s);
                occurrence.put(s, value + 1);
            }
        }
        System.out.println(occurrence);
    }
}
