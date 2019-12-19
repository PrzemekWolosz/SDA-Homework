package com.company.ZadaniaKlasyIMetody;

import java.util.Scanner;

/*
Napisz program wyznaczający potęgę liczby n i m –obie zadane przez użytkownika i drukujący w czytelny sposób wynik na ekranie konsoli
 */
public class zadanie2_PetlaFor2 {
    public static void main(String[] args) {
        exponentiation(getBase(),getExponent());
    }

    public static int getBase () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type base");
        int userBase = scanner.nextInt();
        return userBase;
    }

    public static int getExponent () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type exponent (greater than or equal to zero)");
        int userExponent = scanner.nextInt();
        return userExponent;
    }

    public static void exponentiation (int base, int exponent) {
        int result = base;
        if (exponent == 0) {
            System.out.println(1);
        } else {
            for (int i = 1; i < exponent; i++) {
                result = result * base;
            }
            System.out.println(result);
        }
    }
}
