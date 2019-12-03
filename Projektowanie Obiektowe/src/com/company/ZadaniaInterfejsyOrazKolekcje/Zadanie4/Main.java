package com.company.ZadaniaInterfejsyOrazKolekcje.Zadanie4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Kolo kolo = new Kolo();
        Trojkat trojkat = new Trojkat();
        Prostokat prostokat = new Prostokat();

        Scanner scanner = new Scanner(System.in);
        String ksztalt;

        do {
            System.out.println("Jaki kształt?");
            ksztalt = scanner.nextLine();
            switch (ksztalt) {
                case "kolo":
                    System.out.println("Co chciałbyś obliczyć? [pole,obwod,wypis]");
                    String coLiczymy = scanner.nextLine();
                    switch (coLiczymy) {
                        case "pole":
                            System.out.println("Podaj promień koła");
                            kolo.setPromien(scanner.nextDouble());
                            System.out.println(kolo.obliczPole());
                            break;
                        case "obwod":
                            System.out.println("Podaj promień koła");
                            kolo.setPromien(scanner.nextDouble());
                            System.out.println(kolo.obliczObwod());
                            break;
                        case "wypis":
                            kolo.wypiszOpis();
                            break;
                    }
                    break;
                case "trojkat":
                    System.out.println("Co chciałbyś obliczyć? [pole,obwod,wypis]");
                    coLiczymy = scanner.nextLine();
                    switch (coLiczymy) {
                        case "pole":
                            System.out.println("Podaj wysokosc trojkata");
                            trojkat.setWysokosc(scanner.nextDouble());
                            System.out.println("Podaj podstawe trojkata");
                            trojkat.setPodstawa(scanner.nextDouble());
                            System.out.println(trojkat.obliczPole());
                            break;
                        case "obwod":
                            System.out.println("Podaj podstawe trojkata");
                            trojkat.setPodstawa(scanner.nextDouble());
                            System.out.println("Podaj długość boku A");
                            trojkat.setBokA(scanner.nextDouble());
                            System.out.println("Podaj długość boku B");
                            trojkat.setBokB(scanner.nextDouble());
                            System.out.println(trojkat.obliczObwod());
                            break;
                        case "wypis":
                            trojkat.wypiszOpis();
                            break;
                    }
                    break;
                case "prostokat":
                    System.out.println("Co chciałbyś obliczyć? [pole,obwod,wypis]");
                    coLiczymy = scanner.nextLine();
                    switch (coLiczymy) {
                        case "pole":
                            System.out.println("Podaj długość boku A");
                            prostokat.setBokA(scanner.nextDouble());
                            System.out.println("Podaj długość boku B");
                            prostokat.setBokB(scanner.nextDouble());
                            System.out.println(prostokat.obliczPole());
                            break;
                        case "obwod":
                            System.out.println("Podaj długość boku A");
                            prostokat.setBokA(scanner.nextDouble());
                            System.out.println("Podaj długość boku B");
                            prostokat.setBokB(scanner.nextDouble());
                            System.out.println(prostokat.obliczObwod());
                            break;
                        case "wypis":
                            prostokat.wypiszOpis();
                            break;
                    }
                    break;
            }
        } while (!ksztalt.equals("quit"));
        System.out.println("Kończę pracę");
    }
}