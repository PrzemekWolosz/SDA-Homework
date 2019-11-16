package com.company.ZadaniaKlasyIMetody;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

/* Utworzenie klasy, opisującej statystyki dla tablicy typu liczbowego
a. Utworzenie 2 metod:
i. Psvm
1. Zadeklarowana na sztywno tablica z wartościami początkowymi np. int[] tablica = new int[]{2,5,1,-3,5,22,21,66,21,54}
2. Przesłanie tablicy do metody drukujOpisTablicy
ii. drukujOpisTablicy
1. Metoda drukuje następujące parametry:
a. Minimalna wartość w tablicy
b. Maksymalna wartość w tablicy
c. Średnia wartość tablicy
d. Ilość Elementów
2. Dla w/w przykładu oczekujemy poniższego tekstu: Min wartość: -3 Max wartość: 66 Średnia wartość: 19.4 Ilość elementów: 10
3. Rozszerzenie o podawanie tablicy z palca przez użytkownika (pętla for) – np. iloelementową tablicę chcesz utworzyć? Pobrać wartość i zadeklarować tablicę, która następnie można uzupełnić w pętli for
4 Po wypisaniu podsumowania tablicy zapytać użytkownika czy chce kontynuować (tak/nie) – jeśli tak ponownie wczytać i wyświetlić parametry tablicy
5. Jeśli użytkownik poda wartość spoza zakresu zadać pytanie ponownie i wyświetlić tekst: „Podano nieprawidłową odpowiedź, proszę wpisać ‘tak’ lub ‘nie’.*/

public class zadanie4 {
    public static void main(String[] args) {
        int[] table = generateTable();
        printTableDescription(table);
        continueOrNo();
    }

    public static int[] generateTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the table");
        int sizeOfTable = scanner.nextInt();
        int[] table = new int[sizeOfTable];

        System.out.print("User table: ");

        for (int i = 0; i < table.length - 1; i++) {
            Random random = new Random();
            table[i] = random.nextInt(21) - 10;
            System.out.print(table[i] + "; ");
        }
        return table;
    }

    public static void printTableDescription(int[] table) {
        int min = table[0];
        int max = table[0];
        double sum = 0;
        for (int i = 0; i < table.length; i++) {
            sum = sum + table[i];

            if (table[i] < min) {
                min = table[i];
            } else if (table[i] > max) {
                max = table[i];
            }
        }
        System.out.println();
        System.out.println("Minimum value: " + min + "\nMaximum value: " + max);
        System.out.println("Average value: " + sum / table.length);
        System.out.println("Number of elements: " + table.length);
    }

    public static void continueOrNo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would You like to continue? Type \"yes\" or \"no\"");
        String answer = scanner.nextLine();

        if (answer.equals("yes")) {
            printTableDescription(generateTable());
            continueOrNo();
        } else if (answer.equals("no")) {
            System.out.println("End");
        } else {
            System.out.println("Incorrect answer, please type \"yes\" or \"no\".");
            continueOrNo();
        }
    }
}
