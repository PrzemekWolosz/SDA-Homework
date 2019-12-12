package com.company.ZadaniaKlasyIMetody;

import java.util.Scanner;

/*
Napisz program, który oblicza silnię dla zadanej liczby przez użytkownika (do n=12) korzystając z pętli while
 */
public class zadanie2_PetlaWhile2 {
    public static void main(String[] args) {
        factorialOfNumber(getNumber());
    }

    public static int getNumber () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number");
        int userNumber = scanner.nextInt();
        return userNumber;
    }

    public static void factorialOfNumber (int number) {
        int result = 1;
        while (number > 0) {
            result = result * number;
            number--;
        }
        System.out.println(result);
    }
}
