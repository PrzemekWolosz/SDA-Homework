package com.company.KlasaStringWyrazeniaRegularne.Zadanie8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your text");
        String text = scanner.nextLine();

        System.out.println(countWords(text.toLowerCase()));

    }

    private static Map<String, Integer> countWords(String text) {
        Map<String, Integer> countedWords = new LinkedHashMap<>();
        String[] splittedString = text.replaceAll(",", "").split(" ");
        for (String s : splittedString) {
            if (!countedWords.containsKey(s)) {
                countedWords.put(s, 1);
            } else {
                int occurence = countedWords.get(s);
                countedWords.put(s, occurence + 1);
            }
        }
        return countedWords;
    }
}