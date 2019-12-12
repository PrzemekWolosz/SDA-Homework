package com.company.ZadaniaKlasyIMetody;

import javax.print.MultiDocPrintService;
import java.util.Scanner;
/*
1.Napisz program, który przyjmuje od użytkownika dzielnik oraz liczbę, a następnie drukuje na ekranie wszystkie liczby
mniejsze od zadanej liczby podzielne przez zadany dzielnik
 */
public class zadanie2_PetlaFor1 {
    public static void main(String[] args) {
        printNumbers(getNumber(),getDivisor());
    }

    public static int getNumber () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number");
        int userNumber = scanner.nextInt();
        return userNumber;
    }

    public static int getDivisor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type divisor");
        int userDivisor = scanner.nextInt();
        return userDivisor;
    }

    public static void printNumbers (int number, int divisor) {

        for (int i = number; i > 0; i--) {
            if (i%divisor == 0) {
                System.out.println(i);
            }
        }
    }
}