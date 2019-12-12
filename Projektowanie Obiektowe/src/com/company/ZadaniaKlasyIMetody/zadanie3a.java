package com.company.ZadaniaKlasyIMetody;

import java.util.Random;
import java.util.Scanner;

/*
Utworzenie klasy drukującej losową liczbę w zadanym przez użytkownika zakresie
a. Użytkownik deklaruje maksymalną liczbę (losowanie odbywa się od liczby zera do liczby maksymalnej zdefiniowanej przez użytkownika) np.
i. Użytkownik wpisuje ‘10’ -> liczba losowa przyjmuje wartość od 0 do 10
 */
public class zadanie3a {
    public static void main(String[] args) {
        randomNumberGenerator(getEndOfRange());
    }

    public static int getEndOfRange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type end of range");
        int endOfRange = scanner.nextInt();
        return endOfRange;
    }

    public static void randomNumberGenerator (int endOFRange) {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(endOFRange+1);
            System.out.println(randomNumber);
        }
    }
}