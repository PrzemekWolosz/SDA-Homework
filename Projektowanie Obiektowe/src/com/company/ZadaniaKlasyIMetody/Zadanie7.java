package com.company.ZadaniaKlasyIMetody;

import java.util.Scanner;

/* Spammer – program pyta użytkownika o słowo oraz ilość powtórzeń wg której ma wyświetlić zadane słowa
a. Metoda void
b. 2 argumentowa – Słowo, ilośc powtórzeń
c. Do…while (wprowadzone słowo !equals(„”);  */
public class Zadanie7 {

    public static void main(String[] args) {

        generateSpam(getWord(), getNumber());

    }

    public static String getWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type word");
        String userWord = scanner.nextLine();
        return userWord;
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of repetitions");
        int number = scanner.nextInt();
        return number;
    }

    public static void generateSpam(String word, int number) {
        do {
            for (int i = 0; i < number; i++) {
                System.out.println(word);
            }
            word = getWord();
            number = getNumber();
        } while (!word.equals("end"));
    }
}