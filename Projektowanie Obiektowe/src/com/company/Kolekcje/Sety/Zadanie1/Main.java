package com.company.Kolekcje.Sety.Zadanie1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your text");
        String text = scanner.nextLine();

        onlyUniqueLetters(text);
        System.out.println();
        onlyUniqueWords(text);

    }

    private static void onlyUniqueLetters(String text) {
        List<String> splittedText = new ArrayList<>(Arrays.asList(text.split("")));
        HashSet<String> uniqueLetters = new HashSet<>(splittedText);
        System.out.println(uniqueLetters);
    }

    private static void onlyUniqueWords(String text) {
        List<String> splittedText = new ArrayList<>(Arrays.asList(text.split(" ")));
        HashSet<String> uniqueWords = new HashSet<>(splittedText);
        System.out.println(uniqueWords);
        System.out.println("Number of unique words in text: " + uniqueWords.size());
    }
}
