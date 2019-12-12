package com.company.ZadaniaKlasyIMetody;

import java.util.Scanner;

/*
Napisz program, który oblicza sumę wszystkich liczb poprzedzających zadaną przez użytkownika liczbę.
Dla liczby 100 będzie to suma liczb od 0 do 100 czyli 5050.
 */
public class zadanie2_PetlaWhile1 {
    public static void main(String[] args) {
        sumOfNumbers(getNumber());
    }

    public static int getNumber () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number");
        int userNumber = scanner.nextInt();
        return userNumber;
    }

    public static void sumOfNumbers (int number) {
        int result = 0;
        while (number > 0) {
            result = result + number;
            number--;
        }
        System.out.println(result);
    }
}
