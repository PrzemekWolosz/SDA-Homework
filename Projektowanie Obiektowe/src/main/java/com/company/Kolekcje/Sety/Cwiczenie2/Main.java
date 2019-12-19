package com.company.Kolekcje.Sety.Cwiczenie2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(containesDuplicate("text text"));

    }

    public static boolean containesDuplicate(String text) {
        List<String> splitedText = new ArrayList<>(Arrays.asList(text.split("")));
        List<String> duplicates = new ArrayList<>();
        boolean duplicatedLettersInText = false;
        for (String s : splitedText) {
            if (!duplicates.contains(s)) {
                duplicates.add(s);
            } else {
                duplicatedLettersInText = true;
                break;
            }
        }
        return duplicatedLettersInText;
    }
}
