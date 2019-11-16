package com.company.ZadaniaKlasyIMetody;

import java.util.Scanner;

/*
Napisz program, który wypisuje wszystkie liczby mniejsze od zadanej od użytkownika dopóki użytkownik wpisuje liczby większe od 0
 */
public class zadanie2_PetlaDoWhile1 {
    public static void main(String[] args) {
        numbersLessThan(getNumber());
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number");
        int userNumber = scanner.nextInt();
        return userNumber;
    }

    public static void numbersLessThan(int number) {
        if (number > 0) {
            do {
                number--;
                System.out.println(number);
            } while (number > 0);
        } else {
            System.out.println("Type number greater than zero");
        }
    }
}


