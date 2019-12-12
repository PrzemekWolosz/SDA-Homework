package com.company.ZadaniaOkrojone.Zadanie1do3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        String imie = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj numer indeksu");
        int numerIndeksu = scanner.nextInt();
        while (numerIndeksu <= 99999 || numerIndeksu >= 1000000) {
            System.out.println("Niepoprawny numer indeksu. Numer musi miec 6 cyfr. Podaj poprawny numer");
            numerIndeksu = scanner.nextInt();
        }
        System.out.println("Podaj plec");
        char plec = scanner.next().charAt(0);

        Student nowyStudent = new Student(numerIndeksu, imie, nazwisko, plec);

        nowyStudent.przedstawSie();
    }
}