package com.company.KlasaStringWyrazeniaRegularne.Zadanie10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your text");
        String text = scanner.nextLine();

        countLastCharacterOccurrence(text);

    }

    private static void countLastCharacterOccurrence(String text) {
        char lastCharacter = text.charAt(text.length() - 1);
        int lastCharacterOccurrence = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == lastCharacter) {
                lastCharacterOccurrence++;
            }
        }
        System.out.println(lastCharacterOccurrence);
    }
}
