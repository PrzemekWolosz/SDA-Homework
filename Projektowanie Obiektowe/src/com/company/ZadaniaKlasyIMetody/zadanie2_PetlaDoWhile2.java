package com.company.ZadaniaKlasyIMetody;

import java.util.Scanner;

/*
Napisz program, który oblicza wartość pierwiastka z wprowadzonej przez użytkownika liczby,
dopóki ta przyjmuje wartości większe od 0 (dla uproszczenia przyjmij że użytkownik wprowadza liczby całkowite)
 */
public class zadanie2_PetlaDoWhile2 {
    public static void main(String[] args) {
        squareRoot(getNumber());
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number");
        int userNumber = scanner.nextInt();
        return userNumber;
    }

    public static void squareRoot(int number) {
       if (number > 0) {
           System.out.println(Math.sqrt(number));
       } else {
           System.out.println("Type number greater than zero");
       }
    }
}
