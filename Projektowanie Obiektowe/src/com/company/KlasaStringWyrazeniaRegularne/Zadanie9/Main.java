package com.company.KlasaStringWyrazeniaRegularne.Zadanie9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char rodzajDzialania = podajeRodzajDzialania();
        int[] tablicaLiczbDoDzialania = jakieLiczby();
        int pierwszaLiczba = tablicaLiczbDoDzialania[0];
        int drugaLiczba = tablicaLiczbDoDzialania[1];
        wynikDzialania(rodzajDzialania, pierwszaLiczba, drugaLiczba);

    }

    private static char podajeRodzajDzialania() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rodzaj dzialania jaki chcesz wykonac: + , - , * , /");
        char rodzajDzialania = scanner.nextLine().charAt(0);
        return rodzajDzialania;
    }

    private static int[] jakieLiczby() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int pierwszaLiczba = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int drugaLiczba = scanner.nextInt();
        int[] tablicaDanych = new int[]{pierwszaLiczba, drugaLiczba};

        return tablicaDanych;
    }

    private static void wynikDzialania(char jakieDzialanie, int pierwszaLiczba, int drugaLiczba) {

        switch (jakieDzialanie) {
            case '+':
                System.out.println("Wynik dodawania liczb " + pierwszaLiczba + " i " + drugaLiczba + " wynosi " + (pierwszaLiczba + drugaLiczba));
                break;
            case '-':
                System.out.println("Wynik odejmowania liczb " + pierwszaLiczba + " i " + drugaLiczba + " wynosi " + (pierwszaLiczba - drugaLiczba));
                break;
            case '*':
                System.out.println("Wynik mnożenia liczb " + pierwszaLiczba + " i " + drugaLiczba + " wynosi " + (pierwszaLiczba * drugaLiczba));
                break;
            case '/':
                if (drugaLiczba != 0) {
                    System.out.println("Wynik dzielenia liczb " + pierwszaLiczba + " i " + drugaLiczba + " wynosi " + (pierwszaLiczba / drugaLiczba));
                    break;
                } else {
                    System.out.println("Nie jest dozwolone dzielenie przez zero");
                }
        }
    }
}