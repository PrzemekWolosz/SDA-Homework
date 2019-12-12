package com.company.ZadaniaKlasyIMetody;

import java.util.Scanner;
/*
Rozbudowa klasy Kalkulator z zajęć
a. Dodanie dodatkowej operacji modulo, w sytuacji gdy użytkownik wpisze ‘%’
b. Zmiana wyświetlania wyników, tak aby były drukowane na ekranie w następujący sposób: {liczba1} {działanie} {liczba2} = {wynik}, np. 5-3=2
 */
public class zadanie1 {
    public static void main(String[] args) {

        char rodzajDzialania = podajeRodzajDzialania();
        int[] tablicaLiczbDoDzialania = jakieLiczby();
        int pierwszaLiczba = tablicaLiczbDoDzialania[0];
        int drugaLiczba = tablicaLiczbDoDzialania[1];
        wynikDzialania(rodzajDzialania, pierwszaLiczba, drugaLiczba);

    }

    public static char podajeRodzajDzialania() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rodzaj dzialania jaki chcesz wykonac: + , - , * , /, %");
        char rodzajDzialania = scanner.nextLine().charAt(0);
        return rodzajDzialania;
    }

    public static int[] jakieLiczby() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int pierwszaLiczba = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int drugaLiczba = scanner.nextInt();
        int[] tablicaDanych = new int[]{pierwszaLiczba, drugaLiczba};

        return tablicaDanych;
    }

    public static void wynikDzialania(char jakieDzialanie, int pierwszaLiczba, int drugaLiczba) {

        switch (jakieDzialanie) {
            case '+':
                System.out.println(pierwszaLiczba + " + " + drugaLiczba + " = " + (pierwszaLiczba + drugaLiczba));
                break;
            case '-':
                System.out.println(pierwszaLiczba + " - " + drugaLiczba + " = " + (pierwszaLiczba - drugaLiczba));
                break;
            case '*':
                System.out.println(pierwszaLiczba + " * " + drugaLiczba + " = " + (pierwszaLiczba * drugaLiczba));
                break;
            case '/':
                if (drugaLiczba != 0) {
                    System.out.println(pierwszaLiczba + " / " + drugaLiczba + " = " + (pierwszaLiczba / drugaLiczba));
                    break;
                } else {
                    System.out.println("Nie jest dozwolone dzielenie przez zero");
                }
            case '%':
                System.out.println(pierwszaLiczba + " % " + drugaLiczba + " = " + (pierwszaLiczba%drugaLiczba));
        }
    }
}
