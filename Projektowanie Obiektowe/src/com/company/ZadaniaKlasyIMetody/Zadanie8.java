package com.company.ZadaniaKlasyIMetody;
/*
Statystyki użytych słów – program pobiera od użytkownika tekst. Następnie oblicza statystyki:
a. Ilość użytych słów
b. Średnia długość słowa
c. **Najczęstsze słowo
d. **Najrzadsze słowo   */

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        textStatistics(getText());

    }

    public static String getText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type text");
        String userText = scanner.nextLine();

        return userText;
    }

    public static void textStatistics(String text) {
        int wordNumber = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordNumber++;
            }
        }
        System.out.println("Word number in text: " + wordNumber);

        System.out.println((double)(text.length()-wordNumber+1) / (double)wordNumber);
    }

}