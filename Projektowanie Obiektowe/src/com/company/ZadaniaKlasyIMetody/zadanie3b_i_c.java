package com.company.ZadaniaKlasyIMetody;

import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;

/*
Utworzenie klasy drukującej losową liczbę w zadanym przez użytkownika zakresie
b. Użytkownik deklaruje minimalną liczbę oraz maksymalną :
i. Dla liczby ‘1’ i ‘100’ -> liczba losowa przyjmuje wartość od 1 do 100
c. Użytkownik może podawać liczby ujemne:
i. Dla liczb: ‘-100’ i ‘5’ -> liczba losowa przyjmuje wartość od -100 do 5
 */
public class zadanie3b_i_c {
    public static void main(String[] args) {
        randomNumberGenerator(getStartOfRange(), getEndOfRange());
    }

    public static int getStartOfRange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type start of range (greater than 0)");
        int startOfRange = scanner.nextInt();
        return startOfRange;
    }

    public static int getEndOfRange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type end of range (greater than 0)");
        int endOfRange = scanner.nextInt();
        return endOfRange;
    }

    public static void randomNumberGenerator(int start, int end) {
        if (start > end) {
            System.out.println("End of range has to be greater than start");
        } else {
            Random random = new Random();
            int randomNumber = random.nextInt(1 + end - start) + start;
            System.out.println(randomNumber);
        }
    }
}
